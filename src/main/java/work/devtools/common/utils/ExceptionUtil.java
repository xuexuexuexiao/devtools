package work.devtools.common.utils;

import work.devtools.common.bean.exception.BatchExceptionBean;
import work.devtools.common.bean.exception.CommonBatchExcepion;
import work.devtools.common.bean.exception.CommonBatchExcepionNoRollBack;
import work.devtools.common.bean.exception.CommonException;

import java.util.ArrayList;
import java.util.List;

/**
* @Description: 异常工具类
* @Author: CPQ
* @date: 2019/4/17 下午 1:41
* @Version: 1.0
*/
public class ExceptionUtil {

    private static ThreadLocal<List<BatchExceptionBean>> listThreadLocal = new ThreadLocal<List<BatchExceptionBean>>();

    /*
     * @Author cpq
     * @Description 单个异常抛出
     * @Date 下午 1:47 2019/4/17
     * @Param code
     * @return void
     **/
    public static void singleException(String code){
        throw new CommonException(code);
    }

    /*
     * @Author cpq
     * @Description 回滚的批量异常抛出,此方法配合ExceptionUtil.setBatchException一起使用
     * 用法如::循环里增加异常用ExceptionUtil.setBatchException，循环外抛出异常用ExceptionUtil.batchExceptionNoRollBack()
     *    ExceptionUtil.setBatchException("A", "001","");
     *    ExceptionUtil.setBatchException("B", "001","");
     *    ExceptionUtil.setBatchException("C", "002","");
     *    ExceptionUtil.batchExceptionRollBack();
     *
     * @Date 下午 1:47 2019/4/17
     * @Param list
     * @return void
     **/
    public static void batchExceptionRollBack(){
        if(null != getBatchException() && !getBatchException().isEmpty()) {
            CommonBatchExcepion commonBatchExcepion = new CommonBatchExcepion(getBatchException());
            listThreadLocal.remove();
            throw commonBatchExcepion;
        }
    }

    /*
     * @Author cpq
     * @Description 不回滚的批量异常抛出，此方法配合ExceptionUtil.setBatchException一起使用
     * 用法如:循环里增加异常用ExceptionUtil.setBatchException，循环外抛出异常用ExceptionUtil.batchExceptionNoRollBack()
     *    ExceptionUtil.setBatchException("A", "001","");
     *    ExceptionUtil.setBatchException("B", "001","");
     *    ExceptionUtil.setBatchException("C", "002","");
     *    ExceptionUtil.batchExceptionNoRollBack();
     *
     * @Date 下午 1:48 2019/4/17
     * @Param list
     * @return void
     **/
    public static void batchExceptionNoRollBack() throws CommonBatchExcepionNoRollBack {
            if(null != getBatchException() && !getBatchException().isEmpty()){
                CommonBatchExcepionNoRollBack commonBatchExcepionNoRollBack = new CommonBatchExcepionNoRollBack(getBatchException());
                listThreadLocal.remove();
                throw  commonBatchExcepionNoRollBack;
            }
    }

    /*
     * @Author cpq
     * @Description 批量异常设置，
     * 此方法必须配合ExceptionUtil.batchExceptionRollBack()或ExceptionUtil.batchExceptionNoRollBack()一起使用
     * @Date 下午 3:24 2019/4/17
     * @Param key ：key值
     * @Param code ：错误编码
     * @Param remarks ：备注
     * @return
     **/
    public static void setBatchException(String key,String code,String remarks){
        BatchExceptionBean bean = new BatchExceptionBean(key,code,remarks);
        List<BatchExceptionBean> list = listThreadLocal.get();
        if(list == null){
            list = new ArrayList<BatchExceptionBean>();
            listThreadLocal.set(list);
        }
        list.add(bean);
    }

    /*
     * @Author cpq
     * @Description 批量异常设置，
     * 此方法必须配合ExceptionUtil.batchExceptionRollBack()或ExceptionUtil.batchExceptionNoRollBack()一起使用
     * @Date 下午 3:24 2019/4/17
     * @Param key ：key值
     * @Param code ：错误编码
     * @return
     **/
    public static void setBatchException(String key,String code){
        BatchExceptionBean bean = new BatchExceptionBean(key,code);
        List<BatchExceptionBean> list = listThreadLocal.get();
        if(list == null){
            list = new ArrayList<BatchExceptionBean>();
            listThreadLocal.set(list);
        }
        list.add(bean);
    }

    /*
     * @Author cpq
     * @Description 批量异常，获取
     * @Date 下午 3:25 2019/4/17
     * @Param null
     * @return
     **/
    public static List<BatchExceptionBean> getBatchException(){
        return listThreadLocal.get();
    }



}
