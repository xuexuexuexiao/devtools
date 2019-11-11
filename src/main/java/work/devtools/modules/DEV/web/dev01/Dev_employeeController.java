package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_employee;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_employee;
import work.devtools.modules.DEV.service.Dev_employeeService;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName Dev_employeeController
 * @desc: 员工资料维护Controller
 * @create: 2019-03-28
 **/
@RestController
@RequestMapping("/employee")
public class Dev_employeeController {

    @Autowired
    private Dev_employeeService dev_employeeService;


    /**
     * 查询
     * @param page
     * @param size
     * @param dev_employee
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse queryPage(@RequestParam(value = "0") Integer page,
                                      @RequestParam(value = "10") Integer size, Dev_employee dev_employee){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_employee> dev_employees = dev_employeeService.dynamicPageQuery(pageRequest,dev_employee);

        devToolsResponse.setData(dev_employees);

        return devToolsResponse;
    }

    //

    /**
     * 增加/更新
     * @param dev_employee
     * @param bindingResult
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated Dev_employee dev_employee , BindingResult bindingResult){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(bindingResult.hasErrors()){
            devToolsResponse.setCode(MessageEnum.PARAM_FAIL.getCode());
            devToolsResponse.setMessage(MessageEnum.PARAM_FAIL.getMessage()+"  "+bindingResult.getFieldErrors().toString());
            return devToolsResponse;
        }

        Dev_employee dev_department1 = dev_employeeService.save(dev_employee);
        devToolsResponse.setData(dev_department1);

        return devToolsResponse;
    }

    /**
     * 删除
     * @param employee01
     * @return
     */
    @GetMapping("/delete")
    public DevToolsResponse delete(String employee01){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        T_employee t_employee = dev_employeeService.findByEmployee01(employee01);
        if(t_employee == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("该员工编号编号为："+employee01+"的员工"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_employeeService.delete(employee01);
        devToolsResponse.setData(t_employee);
        return devToolsResponse;
    }



}
