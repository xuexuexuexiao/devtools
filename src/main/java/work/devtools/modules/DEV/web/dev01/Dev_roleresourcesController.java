package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_roleresources;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_roleresources;
import work.devtools.modules.DEV.service.Dev_roleresourcesService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色资源Controller
 * @create: 2019-04-02
 **/
@RestController
@RequestMapping("/roleresources")
public class Dev_roleresourcesController {

    @Autowired
    private Dev_roleresourcesService dev_roleresourcesService;


    /**
     * 查询
     * @param page
     * @param size
     * @param dev_roleresources
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse queryPage(@RequestParam(value = "0") Integer page,
                                      @RequestParam(value = "10") Integer size, Dev_roleresources dev_roleresources){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_roleresources> dev_roleresourcesPage = dev_roleresourcesService.dynamicPageQuery(pageRequest,dev_roleresources);

        devToolsResponse.setData(dev_roleresourcesPage);

        return devToolsResponse;
    }

    //

    /**
     * 增加/更新
     * @param dev_roleresources
     * @param bindingResult
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_roleresources dev_roleresources , BindingResult bindingResult){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(bindingResult.hasErrors()){
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage()+"  "+bindingResult.getFieldErrors().toString());
            return devToolsResponse;
        }

        Dev_roleresources save = dev_roleresourcesService.save(dev_roleresources);
        devToolsResponse.setData(save);

        return devToolsResponse;
    }

    /**
     * 删除
     * @param roleresources01
     * @return
     */
    @GetMapping("/delete")
    public DevToolsResponse delete(String roleresources01){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        T_roleresources t_roleresources = dev_roleresourcesService.findByRoleresources01(roleresources01);
        if(t_roleresources == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("该界面编号为："+roleresources01+" "+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_roleresourcesService.delete(roleresources01);
        devToolsResponse.setData(t_roleresources);
        return devToolsResponse;
    }
}
