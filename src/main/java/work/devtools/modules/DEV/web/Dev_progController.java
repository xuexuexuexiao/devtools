package work.devtools.modules.DEV.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.pojo.dto.Dev_prog;
import work.devtools.modules.DEV.service.Dev_progService;

import java.util.List;


/**
* @Description: 程序作业
* @Author: CPQ
* @date: 2019/4/18 0018 上午 11:34
* @Version: 1.0
*/
@Slf4j
@RestController
@RequestMapping(value = "dev_prog")
public class Dev_progController {
    @Autowired
    private Dev_prog dev_prog;
    @Autowired
    private Dev_progService dev_progService;

    /**
     * 程序初始化
     * @return
     */
    @PostMapping("/open")
    public DevToolsResponse open() {

        // 1. 对 DevToolsRequest 解析，转换为 dto,ui

        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 查询功能
     * @return
     */
    @GetMapping(value="/queryInit")
    public DevToolsResponse queryInit() {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    /**
     * 查询功能
     * @param queryParams
     * @return
     */
//    @Cacheable(value = "list", keyGenerator = "cacheKeyGenerator")
    @GetMapping(value="/query")
    public DevToolsResponse query(@RequestBody QueryParams queryParams) {
        Page<Dev_prog> list = dev_progService.query("",queryParams);
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        devToolsResponse.setData(list);

        // 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 添加功能
     * @return
     */
    @PostMapping(value="/insertInit")
    public DevToolsResponse insertInit() {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_prog  Dev_progUI
//        dev_progUI = (Dev_progUI)devToolsRequest.getUI();


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_prog);
//        devToolsResponse.setUI(dev_progUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 添加功能
     * @param dev_prog
     * @return
     */
    @PostMapping(value="/insert")
    public DevToolsResponse insert(@RequestBody Dev_prog dev_prog) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_prog  Dev_progUI

        //2.业务层 操作数据库
        dev_prog = dev_progService.insert(dev_prog);
        // 3. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_prog);

        // 4. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 修改功能
     * @return
     */
    @PutMapping("/updateInit")
    public DevToolsResponse updateInit() {
        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_prog);
//        devToolsResponse.setUI(dev_progUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 修改功能
     * @param dev_prog
     * @return
     */
    @PutMapping("/update")
    public DevToolsResponse update(@RequestBody Dev_prog dev_prog) {

        //2.业务层 操作数据库
        dev_prog= dev_progService.update(dev_prog);
        // 3. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_prog);

        // 4. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 删除
     * @return
     */
    @DeleteMapping("/deleteInit")
    public DevToolsResponse deleteInit() {

        // 2. 执行 业务校验

        //3.业务层 操作数据库

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 删除 执行
     * @param ids
     * @return
     */
    @DeleteMapping("/delete")
    public DevToolsResponse delete(@RequestBody List<String> ids) {

        //3.业务层 操作数据库
        dev_progService.delete(ids);

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    @GetMapping("/handle/{progCode}")
    public DevToolsResponse handleProgActionList(@PathVariable("progCode") String progCode){
        dev_progService.handleProgActionList(progCode);

        DevToolsResponse devToolsResponse = new DevToolsResponse();
        return  devToolsResponse;
    }

    /**
     *程序结束/ 超时 调用程序
     * @return
     */
    @DeleteMapping("/close")
    public DevToolsResponse close() {

        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI

        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


//    @Autowired
//    private RedisUtil redisUtil;
//
//    @Cacheable("list1")
//    @GetMapping("/list1")
//    public DevToolsResponse list1(@RequestBody DevToolsRequest devToolsRequest){
//        log.info("list1------------------------------------------------------");
//        // 4. 构造 DevToolsResponse
//        DevToolsResponse devToolsResponse = new DevToolsResponse();
//        devToolsResponse.setCode("1");
//        devToolsResponse.setMessage("测试");
//        redisUtil.set("list2",devToolsResponse);
//        // 5. 返回 DevToolsResponse
//        return  devToolsResponse;
//    }
//
////    @Cacheable(value = "llist", keyGenerator = "cacheKeyGenerator")
//    @GetMapping("/list")
//    public DevToolsResponse list(@RequestBody DevToolsRequest devToolsRequest){
//        log.info("list1---------------------------111------------------------");
//        // 4. 构造 DevToolsResponse
//        DevToolsResponse devToolsResponse = new DevToolsResponse();
//        devToolsResponse.setCode(SnowFlakeUtil.getId());
//        devToolsResponse.setMessage(SnowFlakeUtil.getId());
//        // 5. 返回 DevToolsResponse
//        return  devToolsResponse;
//    }


}
