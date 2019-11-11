package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Data
public class T_viewcontrolPK implements Serializable{


    private String viewcontrol01;
    private String viewcontrol02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_viewcontrolPK that = (T_viewcontrolPK) o;

        if (viewcontrol01 != null ? !viewcontrol01.equals(that.viewcontrol01) : that.viewcontrol01 != null)
            return false;
        return viewcontrol02 != null ? viewcontrol02.equals(that.viewcontrol02) : that.viewcontrol02 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (viewcontrol01 != null ? viewcontrol01.hashCode() : 0);
        result = 31 * result + (viewcontrol02 != null ? viewcontrol02.hashCode() : 0);
        return result;
    }

}
