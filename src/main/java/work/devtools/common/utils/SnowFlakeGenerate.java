package work.devtools.common.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName: SnowFlakeGenerate
 * @Description: 雪花算法生成id作为主键
 * @date 2019/04/28
 */
public class SnowFlakeGenerate implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) throws HibernateException {
        return  SnowFlakeUtil.getId();
    }

    public static void  main(String[] obj) {
            for (int i= 0;i<100;i++){
                new Thread(new Runnable(){
                    public void run(){
                                String str = SnowFlakeUtil.getId();
                                System.out.println(Thread.currentThread().toString()+"=====:"+str);
                        }
                }).start();
            }
    }
}
