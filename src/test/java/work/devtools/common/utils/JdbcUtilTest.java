package work.devtools.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.domain.web.constants.Constants;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/22.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class JdbcUtilTest {

    @Test
    public void test() throws SQLException {
//        Connection connection = JdbcUtil.getConnection();
//        log.info("=============="+String.valueOf(connection.getClientInfo()));
        String str = "t_table";
        log.info("str:============"+str.substring(2));
    }

    @Test
    public void ioTest(){
        /*try {
            IOUtils.write("hello write huxiaoxue!",os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}