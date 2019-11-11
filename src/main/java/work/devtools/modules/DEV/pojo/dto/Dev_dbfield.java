package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;
import work.devtools.modules.DEV.pojo.po.T_dbfield;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-18
 **/
@Data
public class Dev_dbfield {

    /**
     * 表
     */
    private String dbfield01;

    /**
     * 字段
     */
    private String dbfield02;

    /**
     * 基础数据类型
     */
    private String dbfield03;

    /**
     * 长度
     */
    private String dbfield04;

    /**
     * key 否
     */
    private String dbfield05;

    /**
     * 不允许为null
     */
    private String dbfield06;

    /**
     * 缺省值
     */
    private String dbfield07;
}
