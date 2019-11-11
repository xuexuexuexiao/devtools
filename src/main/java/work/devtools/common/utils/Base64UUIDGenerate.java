package work.devtools.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName: Base64UUIDGenerate
 * @Description: 压缩UUID作为主键
 * @date 2019/04/28
 */
@Slf4j
public class Base64UUIDGenerate implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return  UUidUtil.compressedUuid();
    }

    public static void  main(String[] obj) {
            for (int i= 0;i<10000;i++){
                new Thread(new Runnable(){
                    public void run(){
                                String str = UUidUtil.compressedUuid();
                                log.info(Thread.currentThread().toString()+"=====:"+str+"========="+str.length()+"-------"+UUidUtil.uncompress(str)+"======="+UUidUtil.compress(UUidUtil.uncompress(str)));
                        }

                }).start();
            }
    }
}

