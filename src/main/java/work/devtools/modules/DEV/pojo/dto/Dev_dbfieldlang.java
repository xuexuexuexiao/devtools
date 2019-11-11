package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.sql.Blob;


/**
 * @author Amy_Wang
 * @version V1.0
 * @ClassName:Dev_dbfieldlang
 * @Description:
 * @date 2018/12/28
 */

@Component("dev_dbfieldlang")
@Data
public class Dev_dbfieldlang{


    private String dbfieldlang01;// '数据库',
    private String dbfieldlang02;// '表',
    private String dbfieldlang03;// '字段',
    private String dbfieldlang04;// '国际化多语言',
    private String dbfieldlang05;// '字段名称',
    private Blob dbfieldlang06;// '字段说明',
    private String dbfieldlang07;// 'nouse',
    private String dbfieldlang08;// 'nouse',
    private String dbfieldlang09;// 'nouse',
    private String dbfieldlang10;// 'nouse',
    private String dbfieldlang11;// 'nouse',
    private String dbfieldlang12;// 'nouse',
    private String dbfieldlang13;// 'nouse',
    private String dbfieldlang14;// 'nouse',
    private String dbfieldlang15;// 'nouse',

}
