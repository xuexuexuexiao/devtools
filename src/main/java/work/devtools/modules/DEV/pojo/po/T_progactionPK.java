package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Data
public class T_progactionPK implements Serializable {


    /**
     * 程序编号
     */
    private String progaction01;

    /**
     * 按钮编号
     */
    private String progaction02;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T_progactionPK that = (T_progactionPK) o;
        return Objects.equals(progaction01, that.progaction01) &&
                Objects.equals(progaction02, that.progaction02);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progaction01, progaction02);
    }
}
