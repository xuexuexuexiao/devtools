package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_progactionlang
 * @Description:
 * @date 2019/04/29
 */
@Data
public class Dev_proglang {
    /**
     * 程序编号
     */
    private String proglang01;

    /**
     * 国际化多语言编号
     */
    private String proglang02;

    /**
     * 国际化多语言名称
     */
    private String lang02;

    /**
     * 程序名称
     */
    private String proglang03;


    public Dev_proglang(){

    }

    public Dev_proglang(String proglang01, String proglang02, String lang02, String proglang03) {
        this.proglang01 = proglang01;
        this.proglang02 = proglang02;
        this.lang02 = lang02;
        this.proglang03 = proglang03;
    }
}
