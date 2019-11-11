package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 联合主键表
 * @create: 2019-04-04
 **/
@Data
public class T_viewrolePK  implements Serializable{

    private String viewrole01;//界面编号
    private String viewrole02;//栏位id
    private String viewrole03;//角色编号

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_viewrolePK that = (T_viewrolePK) o;

        if (viewrole01 != null ? !viewrole01.equals(that.viewrole01) : that.viewrole01 != null) return false;
        if (viewrole02 != null ? !viewrole02.equals(that.viewrole02) : that.viewrole02 != null) return false;
        return viewrole03 != null ? viewrole03.equals(that.viewrole03) : that.viewrole03 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (viewrole01 != null ? viewrole01.hashCode() : 0);
        result = 31 * result + (viewrole02 != null ? viewrole02.hashCode() : 0);
        result = 31 * result + (viewrole03 != null ? viewrole03.hashCode() : 0);
        return result;
    }
}
