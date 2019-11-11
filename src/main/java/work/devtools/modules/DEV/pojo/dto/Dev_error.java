package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Data
public class Dev_error {

    /**
     * 信息编号
     */
    private String error01;

    /**
     * 国际化语言编号
     */
    private String error02;

    /**
     * 信息内容
     */
    private String error03;

    /**
     * 强制弹窗否
     */
    private String error04;

    public Dev_error(String error01, String error02) {
        this.error01 = error01;
        this.error02 = error02;
    }

    public Dev_error() {
    }
}
