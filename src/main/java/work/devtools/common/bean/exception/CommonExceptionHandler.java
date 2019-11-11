package work.devtools.common.bean.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.common.utils.JsonUtil;
import work.devtools.common.utils.ResultUtil;
import work.devtools.common.utils.SecurityUtil;
import work.devtools.modules.DEV.dao.T_errorDao;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
* @Description: 统一异常处理
* @Author:         CPQ
* @date:     2019/4/16 上午 11:41
* @Version:        1.0
*/
@RestControllerAdvice
@Slf4j
public class CommonExceptionHandler {
    @Autowired
    private T_errorDao t_errorDao;

    /**
     * 统一异常处理
    */
    @ExceptionHandler(Exception.class)
    public DevToolsResponse exception(Exception e) {
        log.error(e.getMessage(), e);
        //批量异常的code为与前端约定好的批量异常code,暂定为：BatchException
        String code = "BatchException";
        String messsage = "";

        if(e instanceof  CommonException){//单个异常处理
            CommonException exception = (CommonException) e;
            code = exception.getCode();
            //获取错误编号及用户语言对应的错误信息
            messsage = this.getSingleMessage(code);
            return ResultUtil.error(code, messsage,null);

        }else if(e instanceof  CommonBatchExcepion){//批量异常处理(回滚)
            CommonBatchExcepion exception = (CommonBatchExcepion) e;
            code = exception.getCode();
            //获取国际化错误信息及把message转为json的格式[{},{},{}]
            messsage = this.getBatchMessage(exception.getList());
            return ResultUtil.error(code, messsage,null);

        }else if(e instanceof  CommonBatchExcepionNoRollBack){//批量异常处理(不回滚)
            CommonBatchExcepionNoRollBack exception = (CommonBatchExcepionNoRollBack) e;
            code = exception.getCode();
            //获取国际化及错误信息把message转为json的格式[{},{},{}]
            messsage = this.getBatchMessage(exception.getList());
            return ResultUtil.error(code, messsage,null);

        }else if(e instanceof  BindException){//校验异常处理，处理Get请求中，使用@Valid 验证路径中请求实体校验失败后抛出的异常
            BindException exception = (BindException) e;
            BindingResult bindingResult = exception.getBindingResult();
            //转为批量异常对象bean
            List<BatchExceptionBean> list = this.listConverter(bindingResult);
            //获取国际化错误信息及把message转为json的格式[{},{},{}]
            messsage = this.getBatchMessage(list);
            return ResultUtil.error(code, messsage,null);

        }else if(e instanceof MethodArgumentNotValidException){//校验异常处理，处理请求参数格式错误 @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常。
            MethodArgumentNotValidException exception = (MethodArgumentNotValidException) e;
            BindingResult bindingResult = exception.getBindingResult();
            //转为批量异常对象bean
            List<BatchExceptionBean> list = this.listConverter(bindingResult);
            //获取国际化错误信息及把message转为json的格式[{},{},{}]
            messsage = this.getBatchMessage(list);
            return ResultUtil.error(code, messsage,null);

        }
        return ResultUtil.error("500", e.getMessage());
    }

    /**
    *   转为批量异常对象bean
    */
    private  List<BatchExceptionBean> listConverter(BindingResult bindingResult){
        List<BatchExceptionBean> list = bindingResult.getFieldErrors().stream().map(fieldError->{
            BatchExceptionBean batchExceptionBean = new BatchExceptionBean();
            batchExceptionBean.setCode(fieldError.getDefaultMessage());
            //TODO
            // 如果需要字段，此处需获取字段的国际化
            batchExceptionBean.setKey(fieldError.getField());
            return batchExceptionBean;
        }).collect(Collectors.toList());
        return list;
    }

    /**
    *  根据错误编码和用户默认语言
     * 获取单个异常的国际化信息
    */
    private String getSingleMessage(String code){
        String locale = "";
        String message = t_errorDao.queryErrorMessage(code, SecurityUtil.getLocale());
        return message;
    }

    /**
     * 获取批量异常的国际化信息,并转为json格式
     */
    private String getBatchMessage(List<BatchExceptionBean> list){
        //获取抛出的批量异常信息编号数组
        List codeList = list.stream().map(bean->{
                    return bean.getCode();
                }).distinct().collect(Collectors.toList());
        //根据信息编码数组和用户默认国际化语言获取错误信息
        List<Map<String,String>> msgs = t_errorDao.listErrorMessage(codeList,SecurityUtil.getLocale());
        list.stream().map(bean->msgs.stream().filter(msg->
                Objects.equals(msg.get("error01"),bean.getCode())).findAny().map(msg->{
                    bean.setMessage(msg.get("error03"));
                    return bean;
        })).collect(Collectors.toList());

        return JsonUtil.toJson(list);
    }


}
