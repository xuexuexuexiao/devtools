package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_group;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_group;
import work.devtools.modules.DEV.service.Dev_groupService;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName Dev_groupController
 * @desc: 业务组资料维护Controller
 * @create: 2019-03-28
 **/
@RestController
@RequestMapping("/group")
public class Dev_groupController {

    @Autowired
    private Dev_groupService dev_groupService;



    /**
     * 查询
     * @param page
     * @param size
     * @param dev_group
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse queryPage(@RequestParam(value = "0") Integer page,
                                      @RequestParam(value = "10") Integer size, Dev_group dev_group){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_group> dev_groups = dev_groupService.dynamicPageQuery(pageRequest,dev_group);

        devToolsResponse.setData(dev_groups);

        return devToolsResponse;
    }

    //新增或者更新
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_group dev_group , BindingResult bindingResult) throws SQLException, IOException, ClassNotFoundException {
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(bindingResult.hasErrors()){
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage()+"  "+bindingResult.getFieldErrors().toString());
            return devToolsResponse;
        }

        Dev_group saveDev_group = dev_groupService.save(dev_group);
        devToolsResponse.setData(saveDev_group);

        return devToolsResponse;
    }



    //删除
    @GetMapping("/delete")
    public DevToolsResponse delete(String group01){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        T_group t_group = dev_groupService.findByGroup01(group01);
        if(t_group == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("该业务组编号为："+group01+"的组"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_groupService.delete(group01);
        devToolsResponse.setData(t_group);
        return devToolsResponse;
    }

}
