package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-16
 **/
@Data
public class T_querylinePK implements Serializable{

    private String queryline01;

    private String queryline02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_querylinePK that = (T_querylinePK) o;

        if (queryline01 != null ? !queryline01.equals(that.queryline01) : that.queryline01 != null) return false;
        return queryline02 != null ? queryline02.equals(that.queryline02) : that.queryline02 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (queryline01 != null ? queryline01.hashCode() : 0);
        result = 31 * result + (queryline02 != null ? queryline02.hashCode() : 0);
        return result;
    }
}
