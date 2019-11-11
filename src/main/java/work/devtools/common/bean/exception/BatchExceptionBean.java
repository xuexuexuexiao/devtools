package work.devtools.common.bean.exception;

import lombok.Data;

/**
* @Description: 返回前端的异常对象
* @Author: CPQ
* @date: 2019/4/17 下午 5:14
* @Version: 1.0
*/
@Data
public class BatchExceptionBean {
    /* key 值*/
    private String key;
    /* 错误编码*/
    private String code;
    /* 错误信息*/
    private String message;
    /* 备注*/
    private String remarks;

    public BatchExceptionBean(){

    }
    public BatchExceptionBean(String key,String code){
        this.key = key;
        this.code = code;
    }

    public BatchExceptionBean(String key,String code,String remarks){
        this.key = key;
        this.code = code;
        this.remarks = remarks;
    }
}
