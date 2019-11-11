package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_department;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_department;
import work.devtools.modules.DEV.service.Dev_departmentService;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName Dev_departmentController
 * @desc: 部门资料维护Controller
 * @create: 2019-03-28
 **/
@RestController
@RequestMapping("/department")
public class Dev_departmentController {

    @Autowired
    private Dev_departmentService dev_departmentService;


    /**
     * 查询
     * @param page
     * @param size
     * @param dev_department
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse queryPage(@RequestParam(value = "0") Integer page,
                                      @RequestParam(value = "10") Integer size, Dev_department dev_department){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_department> dev_departments = dev_departmentService.dynamicPageQuery(pageRequest,dev_department);

        devToolsResponse.setData(dev_departments);

        return devToolsResponse;
    }

    //

    /**
     * 增加/更新
     * @param dev_department
     * @param bindingResult
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_department dev_department , BindingResult bindingResult){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(bindingResult.hasErrors()){
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage()+"  "+bindingResult.getFieldErrors().toString());
            return devToolsResponse;
        }

        Dev_department dev_department1 = dev_departmentService.save(dev_department);
        devToolsResponse.setData(dev_department1);

        return devToolsResponse;
    }

    /**
     * 删除
     * @param department01
     * @return
     */
    @GetMapping("/delete")
    public DevToolsResponse delete(String department01){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        T_department t_department = dev_departmentService.findByDepartment01(department01);
        if(t_department == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("该部门编号为："+department01+"的部门"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
         dev_departmentService.delete(department01);
        devToolsResponse.setData(t_department);
        return devToolsResponse;
    }

}
