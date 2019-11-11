package work.devtools.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 获取连接
 * @create: 2019-04-22
 **/
@Component
public class JdbcUtil {


    @Value("${spring.datasource.druid.driver-class-name}")
    private static String DRIVER;

    @Value("${spring.datasource.druid.password}")
    private static String PASSWORD;

    @Value("${spring.datasource.druid.url}")
    private static String URL;

    @Value("${spring.datasource.druid.username}")
    private static String USERNAME;



    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devtools?characterEncoding=UTF-8&useSSL=true", "root","root");
        }catch (Exception e){
            e.printStackTrace();
        }

        return conn;
    }

    public static int executeSql(String sql) throws SQLException {
        Statement statement = getConnection().createStatement();
        boolean execute = statement.execute(sql);
        if(execute){
            return 1;
        }
        return 0;
    }
}
