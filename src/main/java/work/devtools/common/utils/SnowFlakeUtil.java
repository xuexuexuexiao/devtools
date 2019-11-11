package work.devtools.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import work.devtools.common.bean.exception.CommonException;
import work.devtools.modules.DEV.dao.T_langDao;

import javax.management.MalformedObjectNameException;
import java.net.UnknownHostException;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName: SnowFlakeUtil
 * @Description: 雪花算法生成全局唯一
 * @date 2019/04/24
 *
 * Twitter_Snowflake
 * SnowFlake的结构如下(每部分用-分开):
 * 0 - 0000000000 0000000000 0000000000 0000000000 0 - 00000 - 00000 - 000000000000
 * 1位标识，由于long基本类型在Java中是带符号的，最高位是符号位，正数是0，负数是1，所以id一般是正数，最高位是0
 * 41位时间戳(毫秒级)，注意，41位时间戳不是存储当前时间的时间戳，而是存储时间戳的差值（当前时间戳 - 开始时间戳)
 * 得到的值），这里的的开始时间戳，一般是我们的id生成器开始使用的时间，由我们程序来指定的（如下面程序SnowflakeIdUtil类的TWEPOCH属性）。41位的时间戳，可以使用69年，年T = (1L << 41) / (1000L * 60 * 60 * 24 * 365) = 69
 * 10位的数据机器位，可以部署在1024个节点，包括5位datacenterId和5位workerId
 * 12位序列，毫秒内的计数，12位的计数顺序号支持每个节点每毫秒(同一机器，同一时间戳)产生4096个ID序号
 * 加起来刚好64位，为一个Long型。
 */
@Slf4j
@Component
public class SnowFlakeUtil implements InitializingBean {
    @Autowired
    private T_langDao t_langDao;

    /**
     * 开始时间截 (2018-01-01)
     */
    private static final long TWEPOCH = 1514736000000L;

    /**
     * 机器id所占的位数
     */
    private static final long WORKER_ID_BITS = 5L;

    /**
     * 数据标识id所占的位数
     */
    private static final long DATA_CENTER_ID_BITS = 5L;

    /**
     * 支持的最大机器id，结果是31 (这个移位算法可以很快的计算出几位二进制数所能表示的最大十进制数)
     */
    private static final long MAX_WORKER_ID = -1L ^ (-1L << WORKER_ID_BITS);

    /**
     * 支持的最大数据标识id，结果是31
     */
    private static final long MAX_DATA_CENTER_ID = -1L ^ (-1L << DATA_CENTER_ID_BITS);

    /**
     * 序列在id中占的位数
     */
    private static final long SEQUENCE_BITS = 12L;

    /**
     * 机器ID向左移12位
     */
    private static final long WORKER_ID_SHIFT = SEQUENCE_BITS;

    /**
     *  数据标识id向左移17位(12+5)
     */
    private static final long DATA_CENTER_ID_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS;

    /**
     * 时间截向左移22位(5+5+12)
     */
    private static final long TIMESTAMP_LEFT_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS + DATA_CENTER_ID_BITS;

    /**
     * 生成序列的掩码，这里为4095 (0b111111111111=0xfff=4095)
     */
    private static final long SEQUENCE_MASK = -1L ^ (-1L << SEQUENCE_BITS);

    /**
     * 工作机器ID(0~31)
     */
    private static long workerId;

    /**
     * 数据ID(0~31)
     */
    private static long datacenterId;

//    @Value("${snowlfake.workerId}")
//    private void setWorkerId(long workerId){
//        SnowFlakeUtil.workerId =workerId;
//    }
//    @Value("${snowlfake.datacenterId}")
//    private void setdatacenterId(long datacenterId){
//        SnowFlakeUtil.datacenterId =datacenterId;
//    }

    /**
     * 毫秒内序列(0~4095)
     */
    private static long sequence = 0L;

    /**
     * 上次生成ID的时间截
     */
    private static long lastTimestamp = -1L;


    private static int port;
    @Value("${server.port}")
    private void setPort(int port){
        SnowFlakeUtil.port =port;
    }

    //==============================Constructors=====================================
    @Override
    public void afterPropertiesSet() throws Exception {
        //TODO
        //根据ip+端口或端口号获取机器id和数据id（机器id和数据id在数据库配置）
        String host = NetUtil.getHostAddress();
        log.info(port+"----------------------"+host);

//        Optional<T_lang> t = t_langDao.findById("lang01");

        long workerId = 0;

        long datacenterId  = 0;

        if (workerId > MAX_WORKER_ID || workerId < 0) {
            throw new CommonException(String.format("worker Id can't be greater than %d or less than 0", MAX_WORKER_ID));
        }
        if (datacenterId > MAX_DATA_CENTER_ID || datacenterId < 0) {
            throw new CommonException(String.format("datacenter Id can't be greater than %d or less than 0", MAX_DATA_CENTER_ID));
        }

        //获取机器编码
        this.workerId = workerId;
        //获取数据编码
        this.datacenterId = datacenterId;

        log.info("111111111111111111");

    }

    // ==============================Methods==========================================
    public static synchronized String getId(){
        return getNextId()+"";
    }

    /**
     * 获得下一个ID (该方法是线程安全的)
     *
     * @return SnowflakeId
     */
    private static synchronized long getNextId() {
        long timestamp = timeGen();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        //如果是同一时间生成的，则进行毫秒内序列
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & SEQUENCE_MASK;
            //毫秒内序列溢出
            if (sequence == 0) {
                //阻塞到下一个毫秒,获得新的时间戳
                timestamp = tilNextMillis(lastTimestamp);
            }
        }
        //时间戳改变，毫秒内序列重置
        else {
            sequence = 0L;
        }

        //上次生成ID的时间截
        lastTimestamp = timestamp;

        //移位并通过或运算拼到一起组成64位的ID
        return ((timestamp - TWEPOCH) << TIMESTAMP_LEFT_SHIFT)
                | (datacenterId << DATA_CENTER_ID_SHIFT)
                | (workerId << WORKER_ID_SHIFT)
                | sequence;
    }


    /**
     * 阻塞到下一个毫秒，直到获得新的时间戳
     *
     * @param lastTimestamp 上次生成ID的时间截
     * @return 当前时间戳
     */
    protected static long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    /**
     * 返回以毫秒为单位的当前时间
     *
     * @return 当前时间(毫秒)
     */
    protected static long timeGen() {
        return System.currentTimeMillis();
    }

    public static void  main(String[] obj) throws MalformedObjectNameException, UnknownHostException {
        long id = -1L ^ (-1L << 2);
        long st = -1L ^ (-1L << 8);
        log.info("==================="+id+"--------"+st);
         id = -1L ^ (-1L << 3);
         st = -1L ^ (-1L << 7);
        log.info("==================="+id+"--------"+st);
         id = -1L ^ (-1L << 4);
         st = -1L ^ (-1L << 6);

        log.info("==================="+id+"--------"+st);

        id = -1L ^ (-1L << 5);
        st = -1L ^ (-1L << 5);

        log.info("==================="+id+"--------"+st);

    }

}
