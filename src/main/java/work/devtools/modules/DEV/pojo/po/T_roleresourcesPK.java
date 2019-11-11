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
public class T_roleresourcesPK  implements Serializable{

    /**
     * 角色编号
     */
    private String roleresources01;

    /**
     * 资源编号
     */
    private String roleresources02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_roleresourcesPK that = (T_roleresourcesPK) o;

        if (roleresources01 != null ? !roleresources01.equals(that.roleresources01) : that.roleresources01 != null)
            return false;
        return roleresources02 != null ? roleresources02.equals(that.roleresources02) : that.roleresources02 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (roleresources01 != null ? roleresources01.hashCode() : 0);
        result = 31 * result + (roleresources02 != null ? roleresources02.hashCode() : 0);
        return result;
    }
}
