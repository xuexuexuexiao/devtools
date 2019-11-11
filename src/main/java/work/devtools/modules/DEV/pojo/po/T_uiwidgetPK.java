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
public class T_uiwidgetPK implements Serializable{
    /**
     * 前端框架
     */
    private String uiwidget01;

    /**
     * 控件
     */
    private String uiwidget02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        T_uiwidgetPK that = (T_uiwidgetPK) o;

        if (uiwidget01 != null ? !uiwidget01.equals(that.uiwidget01) : that.uiwidget01 != null) return false;
        return uiwidget02 != null ? uiwidget02.equals(that.uiwidget02) : that.uiwidget02 == null;
    }

    @Override
    public int hashCode() {
        int result = uiwidget01 != null ? uiwidget01.hashCode() : 0;
        result = 31 * result + (uiwidget02 != null ? uiwidget02.hashCode() : 0);
        return result;
    }
}
