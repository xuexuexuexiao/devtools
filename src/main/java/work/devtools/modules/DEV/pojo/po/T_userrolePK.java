package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-11
 **/
@Data
public class T_userrolePK  implements Serializable{

    /**
     * 用户编号
     */
    private String userrole01;

    /**
     * 权限分类
     */
    private String userrole02;

    /**
     * 角色编号/程序编号
     */
    private String userrole03;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_userrolePK that = (T_userrolePK) o;

        if (userrole01 != null ? !userrole01.equals(that.userrole01) : that.userrole01 != null) return false;
        if (userrole02 != null ? !userrole02.equals(that.userrole02) : that.userrole02 != null) return false;
        return userrole03 != null ? userrole03.equals(that.userrole03) : that.userrole03 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userrole01 != null ? userrole01.hashCode() : 0);
        result = 31 * result + (userrole02 != null ? userrole02.hashCode() : 0);
        result = 31 * result + (userrole03 != null ? userrole03.hashCode() : 0);
        return result;
    }
}
