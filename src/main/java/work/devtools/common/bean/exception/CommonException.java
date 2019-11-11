package work.devtools.common.bean.exception;

import lombok.Data;

/**
* @Description:  自定义单异常类
* @Author:         CPQ
* @date:     2019/4/16 上午 11:40
* @Version:        1.0
*/
@Data
public class CommonException extends RuntimeException {

    /** code为数据表t_error的信息编号，字段error01 */
    private String code;

    public CommonException(String code){
        super("");
        this.code = code;
    }



}
