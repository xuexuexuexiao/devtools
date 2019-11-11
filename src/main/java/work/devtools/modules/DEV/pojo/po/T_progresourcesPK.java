package work.devtools.modules.DEV.pojo.po;

import java.io.Serializable;
import java.util.Objects;

/**
 * @version V1.0
 * @ClassName:D
 * @Description:
 * @date 2019/04/19
 */
public class T_progresourcesPK implements Serializable {
    /**
     * 程序编号
     */
    private String progresources01;

    /**
     * 资源编号
     */
    private String progresources02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T_progresourcesPK that = (T_progresourcesPK) o;
        return Objects.equals(progresources01, that.progresources01) &&
                Objects.equals(progresources02, that.progresources02);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progresources01, progresources02);
    }
}
