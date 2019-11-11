package work.devtools.common.domain.web.constants;

import java.io.File;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:常量类
 * @create: 2019-04-15
 **/
public class Constants {

    /**
     * 程序编号
     */
    public interface progcCode{
        //错误 程序编号
        public String ERROR_PROGCODE = "p_ze";

    }

    //TODO 其他常量

    public interface SIGNSTR{
        public String EQ = "=";
        public String GT = ">";
        public String LT = "<";
        public String GE = ">=";
        public String LE = "<=";
        public String NEQ = "<>";
        public String STAR = "*";
        public String QUESTION = "?";
        public String COLON = ":";
        public String VERTICAL_BAR = "|";
    }


    public interface DATATYPE{
        public String STR_REG = "(varchar|char|timestamp|date|datetime)";
        public String VARCHAR = "varchar";
        public String _CHAR = "char";
        public String TIMESTAMP = "timestamp";
        public String DATE = "date";
        public String DATETIME = "datetime";

    }

    public interface PROJECT_PATH{
        String DEV_PATH = "D:"+ File.separator+"ybworkspace"+File.separator+"devtools"+
                File.separator+"src"+File.separator+"main" + File.separator + "java" +
                File.separator;


    }
}
