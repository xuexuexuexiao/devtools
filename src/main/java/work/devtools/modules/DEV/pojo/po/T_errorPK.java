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
public class T_errorPK implements Serializable{

    private String error01;

    private String error02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        T_errorPK t_errorPK = (T_errorPK) o;

        if (error01 != null ? !error01.equals(t_errorPK.error01) : t_errorPK.error01 != null) return false;
        return error02 != null ? error02.equals(t_errorPK.error02) : t_errorPK.error02 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (error01 != null ? error01.hashCode() : 0);
        result = 31 * result + (error02 != null ? error02.hashCode() : 0);
        return result;
    }
}
