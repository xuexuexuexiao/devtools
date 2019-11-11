package work.devtools.modules.DEV.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.modules.DEV.pojo.dto.Dev_dbfield;
import work.devtools.modules.DEV.pojo.dto.Dev_dbtable;
import work.devtools.modules.DEV.pojo.dto.Dev_tableField;
import work.devtools.modules.DEV.service.Dev_dbtableService;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-28
 **/
@RestController
@RequestMapping("/dev_dbdict")
@Slf4j
public class Dev_dbfieldController {

    @Autowired
    private Dev_dbtableService dev_dbtableService;

    /**
     * 多表操作
     * @param dev_tableField
     * @return
     */
    @PostMapping("/insert")
    public DevToolsResponse insert(@RequestBody Dev_tableField dev_tableField){
        //TODO 字段校验
//        Dev_tableField tableField = dev_dbtableService.save(dev_tableField);
        DevToolsResponse response = new DevToolsResponse();
//        response.setData(tableField);
        return response;
    }

    /**
     * 更新
     * @param dev_dbtable
     * @return
     */
    @PostMapping("/update")
    public DevToolsResponse update(@RequestBody Dev_dbtable dev_dbtable){
        DevToolsResponse response = new DevToolsResponse();
        log.info("===========");
        return response;
    }

    /**
     * 批量提交
     * @param dev_dbfieldList
     * @return
     */
    @PostMapping("/addAll")
    public DevToolsResponse addAll(@RequestBody List<Dev_dbfield> dev_dbfieldList){
        DevToolsResponse response = new DevToolsResponse();
        log.info("===========: "+ dev_dbfieldList.stream().map(map -> map.getDbfield01()));
        return response;
    }

    //

}
