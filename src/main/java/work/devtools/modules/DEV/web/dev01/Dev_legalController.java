package work.devtools.modules.DEV.web.dev01;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.common.utils.NoCreatorUtil;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.pojo.enums.MessageEnum;
import work.devtools.modules.DEV.pojo.po.T_legal;
import work.devtools.modules.DEV.service.Dev_legalService;

import javax.validation.Valid;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName Dev_legalController
 * @desc 法人资料维护Controller
 * @create 2019-03-28
 **/
@RestController
@RequestMapping(value = "/legal")
public class Dev_legalController {


    @Autowired
    private Dev_legalService dev_legalService;


    /**
     * 查询法人资料
     * @param page  页码
     * @param size   页大小
     * @param legal
     * @return
     */
    @PostMapping("/list")
    public DevToolsResponse query(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                  @RequestParam(value = "size", defaultValue = "10") Integer size,Dev_legal legal){

        //查询条件
//        Dev_legal legal = (Dev_legal) request.getData();
        PageRequest pageRequest = new PageRequest(page,size);

        Page<Dev_legal> legalList = dev_legalService.query(legal,pageRequest);

        DevToolsResponse response = new DevToolsResponse();
        response.setData(legalList);

        return response;
    }


    /**
     * 保存或者更新
     * @param dev_legal
     * @param bindingResult
     * @return
     */
    @PostMapping("/insert")
    public DevToolsResponse insert(@Valid Dev_legal dev_legal, BindingResult bindingResult){
        DevToolsResponse response =  new DevToolsResponse();
        //校验参数
        if(bindingResult.hasErrors()){
            response.setCode(MessageEnum.PARAM_FAIL.getCode());
            response.setData(MessageEnum.PARAM_FAIL.getMessage());
            return  response;
        }
        T_legal tLegal = new T_legal();
        try {
            //修改
            if(!StringUtils.isEmpty(dev_legal.getLegal01())){
                tLegal =  dev_legalService.findOne(dev_legal.getLegal01());
            }
            //新增
            else{
                dev_legal.setLegal01(NoCreatorUtil.genUniqueKey(NoCreatorUtil.LEGAL));
            }
            T_legal legal = dev_legalService.save(dev_legal);
            response.setData(legal);
            response.setCode(MessageEnum.SUCCESS.getCode());
            response.setMessage(MessageEnum.SUCCESS.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }



    /**
     * 删除法人资料
     * @return
     */
    @PutMapping("/delete")
    public DevToolsResponse delete(){

        return null;
    }

}
