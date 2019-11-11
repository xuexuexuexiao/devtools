package work.devtools.modules.DEV.web.dev01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_company;
import work.devtools.modules.DEV.service.Dev_companyService;

import java.util.List;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName Dev_companyController
 * @desc: 公司资料维护Controller
 * @create: 2019-03-28
 **/
@RestController
@RequestMapping("/company")
@Validated
public class Dev_companyController {

    @Autowired
    private Dev_companyService dev_companyService;

    /**
     * 查询
     * @param page
     * @param size
     * @param dev_company
     * @return
     */
    @GetMapping("/list")
    public  DevToolsResponse list(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                  @RequestParam(value = "size", defaultValue = "10") Integer size,Dev_company dev_company){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        PageRequest pageRequest = new PageRequest(page,size);
        Page<Dev_company> list = dev_companyService.query(dev_company,pageRequest);
        devToolsResponse.setData(list);
        return devToolsResponse;
    }

    /**
     * 保存或者更新
     * @return
     */
    @PostMapping("/save")
    public DevToolsResponse save(@Validated  Dev_company dev_company, BindingResult bindingResult){
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
            T_company result = dev_companyService.save(dev_company);

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
     * @param company01 公司编号
     * @return
     */
    @DeleteMapping("/delete")
    public DevToolsResponse delete(@RequestParam String company01){

        T_company t_company = dev_companyService.findByCompany01(company01);


        DevToolsResponse devToolsResponse = new DevToolsResponse();
        if(t_company == null){
            devToolsResponse.setCode(MessageEnum.NOT_EXIST.getCode());
            devToolsResponse.setMessage("公司资料"+MessageEnum.NOT_EXIST.getMessage());
            return devToolsResponse;
        }
        dev_companyService.delete(t_company);
        devToolsResponse.setCode(MessageEnum.DELETE_SUCCESS.getCode());
        devToolsResponse.setMessage(MessageEnum.DELETE_SUCCESS.getMessage());

        return devToolsResponse;
    }

    @PostMapping("/validator")
    public DevToolsResponse validator(@Validated  T_company t_company,BindingResult bindingResult){
        StringBuilder sb = new StringBuilder();
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().stream().forEach(error -> sb.append(error.getDefaultMessage()+" /"));
        }
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        devToolsResponse.setData(bindingResult.toString());
        return null;
    }
}
