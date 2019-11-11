package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;
import work.devtools.modules.DEV.pojo.po.T_prog;
import work.devtools.modules.DEV.pojo.po.T_progaction;

import javax.persistence.Id;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_progaction
 * @Description:
 * @date 2019/04/28
 */
@Data
public class Dev_progaction {

    /**
     * 程序编号
     */
    private String progaction01;

    /**
     * 按钮编号
     */
    private String progaction02;
    /**
     * URL
     */
    private String resources03;

    /**
     * 国际化多语言
     */
    private String progactionlang03;

    /**
     * 按钮名称
     */
    private String progactionlang04;

    public Dev_progaction(){

    }

    public Dev_progaction(String progaction01, String progaction02, String resources03, String progactionlang03, String progactionlang04) {
        this.progaction01 = progaction01;
        this.progaction02 = progaction02;
        this.resources03 = resources03;
        this.progactionlang03 = progactionlang03;
        this.progactionlang04 = progactionlang04;
    }
}
