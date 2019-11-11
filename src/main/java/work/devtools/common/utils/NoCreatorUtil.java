package work.devtools.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 生成编号
 * @create: 2019-03-28
 **/
public class NoCreatorUtil {
    /**
     * 法人
     */
    public static final String LEGAL = "FR";


    /**
     *
     * @param pre  前缀标志
     * @return
     */
    public static synchronized String genUniqueKey(String pre) {
        // 时间
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = sdf.format(now);

        // 随机数
        String random = UUID.randomUUID().toString().substring(0, 4);

        // 编号
        return pre + time + random;
    }
}
