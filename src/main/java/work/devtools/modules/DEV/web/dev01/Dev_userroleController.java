package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_userrole;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_userrole;
import work.devtools.modules.DEV.service.Dev_userroleService;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户角色Controller
 * @create: 2019-04-01
 **/
@RestController
@RequestMapping(value = "/userrole")
public class Dev_userroleController {

    @Autowired
    private Dev_userroleService dev_userroleService;


    /**
     * 查询
     * @param page
     * @param size
     * @param dev_userrole
     * @return
     */
    @GetMapping("/list")
    public DevToolsResponse list(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                 @RequestParam(value = "size", defaultValue = "10") Integer size, Dev_userrole dev_userrole){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_userrole> list = dev_userroleService.query(dev_userrole,pageRequest);
        devToolsResponse.setData(list);
        return devToolsResponse;
    }

    /**
     * 保存或者更新
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_userrole dev_userrole, BindingResult bindingResult){
        DevToolsResponse devToolsResponse =  new DevToolsResponse();
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            String error = fieldErrors.toString();
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage() + error);
            return devToolsResponse;
        }
        //校验
        try {
            T_userrole result = dev_userroleService.save(dev_userrole);

            devToolsResponse.setCode(MessageEnum.SUCCESS.getCode());
            devToolsResponse.setMessage(MessageEnum.SUCCESS.getMessage());
            devToolsResponse.setData(result);
            return devToolsResponse;
        }catch (Exception e){
            e.printStackTrace();
        }
        return devToolsResponse;

    }

    /**
     * 删除
     * @param userrole01 用户编号
     * @return
     */
    @DeleteMapping("/delete")
    public DevToolsResponse delete(@RequestParam String userrole01){

        T_userrole t_userrole = dev_userroleService.findByUserrole01(userrole01);


        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(t_userrole == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("用户"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_userroleService.delete(t_userrole);
        devToolsResponse.setCode(MessageEnum.DELETE_SUCCESS.getCode());
        devToolsResponse.setMessage(MessageEnum.DELETE_SUCCESS.getMessage());

        return devToolsResponse;
    }
}
