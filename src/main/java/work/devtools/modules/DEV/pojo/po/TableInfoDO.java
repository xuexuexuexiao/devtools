package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:  表数据
 * @create: 2019-04-23
 **/
//@Data
public class TableInfoDO {

    //表的名称
    private String tableName;
    //表的备注
    private String comments;
    //表的主键
    private ColumDO pk;
    //表的列名(不包含主键)
    private List<ColumDO> columns;

    //类名(第一个字母大写)，如：t_user => T_User
    private String className;
    //类名(第一个字母小写)，如：t => t_user
    private String classname;
    //名字
    private String name;



    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ColumDO getPk() {
        return pk;
    }

    public void setPk(ColumDO pk) {
        this.pk = pk;
    }

    public List<ColumDO> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumDO> columns) {
        this.columns = columns;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
