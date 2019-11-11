package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;
import work.devtools.modules.DEV.pojo.po.T_progactionlang;

import javax.persistence.Id;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_progactionlang
 * @Description:
 * @date 2019/04/29
 */
@Data
public class Dev_progactionlang {
    /**
     * 程序编号
     */
    private String progactionlang01;

    /**
     * 按钮编号
     */
    private String progactionlang02;

    /**
     * 国际化多语言
     */
    private String progactionlang03;
    /**
     * 国际化多语言名称
     */
    private String lang02;

    /**
     * 按钮名称
     */
    private String progactionlang04;

    public Dev_progactionlang(){

    }

    public Dev_progactionlang(String progactionlang01, String progactionlang02, String progactionlang03, String lang02, String progactionlang04) {
        this.progactionlang01 = progactionlang01;
        this.progactionlang02 = progactionlang02;
        this.progactionlang03 = progactionlang03;
        this.lang02 = lang02;
        this.progactionlang04 = progactionlang04;
    }
}
