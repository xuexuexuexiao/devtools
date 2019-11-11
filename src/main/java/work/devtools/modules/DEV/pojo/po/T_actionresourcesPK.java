package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_actionresourcesPK implements Serializable {


    /**
     * 程序编号
     */
    private String actionresources01;

    /**
     * 按钮编号
     */
    private String actionresources02;

    /**
     * 资源编号
     */
    private String actionresources03;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T_actionresourcesPK that = (T_actionresourcesPK) o;
        return Objects.equals(actionresources01, that.actionresources01) &&
                Objects.equals(actionresources02, that.actionresources02) &&
                Objects.equals(actionresources03, that.actionresources03);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionresources01, actionresources02,actionresources03);
    }
}
