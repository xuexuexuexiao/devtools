package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:列信息
 * @create: 2019-04-23
 **/
//@Data
public class ColumDO {
    // 列名
    private String columnName;
    // 列名类型
    private String dataType;
    // 列名备注
    private String comments;

    // 属性名称(第一个字母大写)，如：user_name => UserName
    private String attrName;
    // 属性名称(第一个字母小写)，如：user_name => userName
    private String attrname;
    // 属性类型
    private String attrType;


    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAttrname() {
        return attrname;
    }

    public void setAttrname(String attrname) {
        this.attrname = attrname;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }


}
