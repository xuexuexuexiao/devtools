package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_resources;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_resources;
import work.devtools.modules.DEV.service.Dev_resourcesService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 系统资源Controller
 * @create: 2019-04-02
 **/
@RestController
@RequestMapping("/resources")
public class Dev_resourcesController {

    @Autowired
    private Dev_resourcesService dev_resourcesService;


    /**
     * 查询
     * @param page
     * @param size
     * @param dev_resources
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse queryPage(@RequestParam(value = "0") Integer page,
                                      @RequestParam(value = "10") Integer size, Dev_resources dev_resources){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_resources> dev_departments = dev_resourcesService.dynamicPageQuery(pageRequest,dev_resources);

        devToolsResponse.setData(dev_departments);

        return devToolsResponse;
    }

    //

    /**
     * 增加/更新
     * @param dev_resources
     * @param bindingResult
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_resources dev_resources , BindingResult bindingResult){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(bindingResult.hasErrors()){
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage()+"  "+bindingResult.getFieldErrors().toString());
            return devToolsResponse;
        }

        Dev_resources dev_resources1 = dev_resourcesService.save(dev_resources);
        devToolsResponse.setData(dev_resources1);

        return devToolsResponse;
    }

    /**
     * 删除
     * @param resources01
     * @return
     */
    @GetMapping("/delete")
    public DevToolsResponse delete(String resources01){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        T_resources t_resources = dev_resourcesService.findByResources01(resources01);
        if(t_resources == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("该部门编号为："+resources01+"的部门"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_resourcesService.delete(t_resources);
        devToolsResponse.setData(t_resources);
        return devToolsResponse;
    }

}
