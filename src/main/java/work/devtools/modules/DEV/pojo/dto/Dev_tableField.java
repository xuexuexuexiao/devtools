package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:  t_dbtable  List
 * @create: 2019-04-18
 **/
@Data
public class Dev_tableField {

    /**
     * 表
     */
    private String dbtable01;

    /**
     * 表名
     */
    private String dbtable02;

    /**
     * 备注
     */
    private String dbtable03;

    /**
     * 模块
     */
    private String dbtable04;

    /**
     * 国际化否
     */
    private String dbtable05;

    /**
     * PO类名
     */
    private String dbtable06;

    /**
     * DAO类名
     */
    private String dbtable07;

    private List<Dev_dbfield> dbfieldList = new ArrayList<>();

}
