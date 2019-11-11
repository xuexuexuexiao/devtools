package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-04
 **/
@Data
public class T_viewuserPK  implements Serializable{

    private String viewuser01;//界面编号
    private String viewuser02;//栏位id
    private String viewuser03;//用户编号

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_viewuserPK that = (T_viewuserPK) o;

        if (viewuser01 != null ? !viewuser01.equals(that.viewuser01) : that.viewuser01 != null) return false;
        if (viewuser02 != null ? !viewuser02.equals(that.viewuser02) : that.viewuser02 != null) return false;
        return viewuser03 != null ? viewuser03.equals(that.viewuser03) : that.viewuser03 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (viewuser01 != null ? viewuser01.hashCode() : 0);
        result = 31 * result + (viewuser02 != null ? viewuser02.hashCode() : 0);
        result = 31 * result + (viewuser03 != null ? viewuser03.hashCode() : 0);
        return result;
    }
}
