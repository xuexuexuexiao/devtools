package work.devtools.modules.DEV.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.ui.ElementUIInput;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.common.domain.web.DevToolsRequest;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.common.domain.web.constants.Constants;
import work.devtools.common.utils.DbUtil;
import work.devtools.common.utils.MapObjUtil;
import work.devtools.common.utils.QueryUtil;
import work.devtools.modules.DEV.pojo.dto.Dev_error;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_error;
import work.devtools.modules.DEV.service.Dev_errorService;
import work.devtools.modules.DEV.service.Dev_viewcontrolService;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 错误信息提示Controller
 * @create: 2019-04-15
 **/
@RestController
@RequestMapping("/error")
public class Dev_errorController {

    /**
     * 程序编号
     */
    private final static  String PROGCODE = Constants.progcCode.ERROR_PROGCODE;

    @Autowired
    private Dev_errorService dev_errorService;

    @Autowired
    private Dev_viewcontrolService dev_viewcontrolService;


    /**
     * 查询初始化:初始化前端页面
     * @param devToolsRequest
     * @return
     */
    @GetMapping(value="/queryInit")
    public DevToolsResponse queryInit(@RequestBody  DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();



        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 查询
     * @param
     * @return
     */
    @PostMapping("/query")
    public DevToolsResponse query(@RequestBody   Map map){
        QueryParams queryParams = new QueryParams(map);
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        //QueryCode 写死 通过 常量或者枚举获得
        Page<Object> error01 = QueryUtil.query("errorQuery", queryParams);
//        Page<Dev_error> list = dev_errorService.query("errorQuery",queryParams);
        List<Dev_error> errorList = new ArrayList<>();
        errorList.add(new Dev_error("010","111"));
        errorList.add(new Dev_error("010","oooo"));
        devToolsResponse.setData(errorList);
        return devToolsResponse;
    }

    /**
     * 新增页面
     * @param
     * @return
     */
    @PostMapping("/insertInit")
    public DevToolsResponse insertInit(){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        //前端传递的参数

        //传递参数转换 ，并查询得到栏位属性信息：可控 可输入
        //TODO 根据程序编号和界面编号得到error新增页面控件的栏位属性信息：UI

        devToolsResponse.setCode("");
        devToolsResponse.setMessage("");
        return devToolsResponse;
    }


    /**
     * 新增保存
     * @return
     */
    @PostMapping("/insert")
    public DevToolsResponse insert(@RequestBody  DevToolsRequest devToolsRequest){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        Dev_error dev_error = (Dev_error)devToolsRequest.getData();
        //新增的dev_error数据 TODO 先用MapObjectUtil 的map转Object进行转换为想要的对象
//        Object o = MapObjUtil.mapToObject2(Dev_error.class, (Map<String, Object>) devToolsRequest.getData());
//
//        Dev_error dev_error = (Dev_error)o;

        //TODO 数据校验
        //校验
        try {
             dev_errorService.save(dev_error);

            devToolsResponse.setCode(MessageEnum.SUCCESS.getCode());
            devToolsResponse.setMessage(MessageEnum.SUCCESS.getMessage());
            //devToolsResponse.setUI();
//            devToolsResponse.setData(result);
            return devToolsResponse;
        }catch (Exception e){
            e.printStackTrace();
        }
        return devToolsResponse;

    }

    /**
     * 修改画面
     * @param devToolsRequest
     * @return
     */
    @PostMapping("/updateInit")
    public DevToolsResponse updateInit(@RequestBody  DevToolsRequest devToolsRequest){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        Map<String, Object> data = (Map<String, Object>) devToolsRequest.getData();
        Object o = MapObjUtil.mapToObject2(Dev_error.class, data);

        Dev_error dev_error = (Dev_error)o;
        //传递参数转换 ，并查询得到栏位属性信息：可控 可输入
        getUIData(devToolsResponse, data);
        T_error t_error = dev_errorService.findByError01(dev_error.getError01());

        devToolsResponse.setData(t_error);
        //TODO 获取国际化信息 设置
        //成功Code设置
        devToolsResponse.setCode("");
        //消息设置
        devToolsResponse.setMessage("");
        return devToolsResponse;
    }

    /**
     * 获取UI 设置数据
     * @param devToolsResponse
     * @param parms
     */
    private void getUIData(DevToolsResponse devToolsResponse, Map parms) {
        //TODO 根据界面编号得到error新增页面控件的栏位属性信息：UI
        List<ElementUIInput> elementUIInputList = dev_viewcontrolService.findByViewcontrol01(String.valueOf(parms.get("viewcontrol01")));
        //前端栏位控制数据
        devToolsResponse.setUI(elementUIInputList);
    }


    /**
     * 修改保存
     * @param devToolsRequest
     * @return
     */
    @PostMapping("/update")
    public DevToolsResponse update(DevToolsRequest devToolsRequest){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        Map<String, Object> data = (Map<String, Object>) devToolsRequest.getData();
        Object o = MapObjUtil.mapToObject2(Dev_error.class, data);

        getUIData(devToolsResponse, data);
        //修改的dev_error数据
        Dev_error dev_error = (Dev_error)o;

        //TODO 数据校验
        try {
            T_error result = dev_errorService.save(dev_error);

            devToolsResponse.setCode("");
            devToolsResponse.setMessage("");
            //devToolsResponse.setUI();
            devToolsResponse.setData(result);
            return devToolsResponse;
        }catch (Exception e){
            e.printStackTrace();
        }
        return devToolsResponse;

    }

    /**
     * 删除
     * @param
     * @return
     */
    @DeleteMapping("/delete")
    public DevToolsResponse delete(@RequestBody DevToolsRequest devToolsRequest){

        Map<String, Object> data = (Map<String, Object>) devToolsRequest.getData();
        Object o = MapObjUtil.mapToObject2(Dev_error.class, data);

        Dev_error dev_error = (Dev_error)o;

        T_error t_error = dev_errorService.findByError01(dev_error.getError01());


        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(t_error == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("公司资料"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_errorService.delete(t_error);
        devToolsResponse.setCode(MessageEnum.DELETE_SUCCESS.getCode());
        devToolsResponse.setMessage(MessageEnum.DELETE_SUCCESS.getMessage());
        //TODO 查询 UI 属性
        //devToolsResponse.setUI(object);

        return devToolsResponse;
    }

    //TODO 公用的查询UI 方法







    @PostMapping("/validator")
    public DevToolsResponse validator(@Validated  T_error t_error,BindingResult bindingResult){
        StringBuilder sb = new StringBuilder();
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().stream().forEach(error -> sb.append(error.getDefaultMessage()+" /"));
        }
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        devToolsResponse.setData(bindingResult.toString());
        return null;
    }

}
