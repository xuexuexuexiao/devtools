package work.devtools.modules.DEV.web;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import work.devtools.common.domain.web.DevToolsResponse;
import work.devtools.common.domain.web.DevToolsRequest;

import work.devtools.common.domain.web.DevToolsRequest;
import work.devtools.modules.DEV.pojo.dto.Dev_dbfieldlang;
import work.devtools.modules.DEV.pojo.ui.Dev_dbfieldlangUI;
import work.devtools.modules.DEV.service.Dev_dbfieldlangService;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amy_Wang
 * @version V1.0
 * @ClassName:Dev_dbfieldlangController
 * @Description:
 * @date 2018/12/28
 */
@RestController
@RequestMapping(value = "dev_dbfieldlang")
public class Dev_dbfieldlangController {

    @Autowired
    private Dev_dbfieldlang dev_dbfieldlang;

    @Autowired
    private Dev_dbfieldlangUI dev_dbfieldlangUI;

    @Autowired
    private Dev_dbfieldlangService dev_dbfieldlangService;

    @Autowired
    private Dev_dbfieldlangCondition dev_dbfieldlangCondition;


    // 0. 程序加载初始化
    //    0.1  有参数
    //    0.2  无参数

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @DeleteMapping("/dbfieldlang_open")
    public DevToolsResponse dbfieldlangOpen(DevToolsRequest devToolsRequest) {


        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



// 1. 按钮 初始化 （运行 ‘2’ 功能的时候需要进行初始化，比如 录入时，录入预设值，设置可录，不可录入）

// 2.  录入/删除/修改/查询/复制

/**
 * 查询功能
 * @param devToolsRequest
 * @return
 */
    @GetMapping(value="/query_init")
    public DevToolsResponse queryInit(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    /**
     * 查询功能
     * @param devToolsRequest
     * @return
     */
    @GetMapping(value="/query")
    public DevToolsResponse query(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();

        //2.业务层 查询数据库
        List<Dev_dbfieldlang> query = dev_dbfieldlangService.query(dev_dbfieldlangCondition);

        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    /**
     * 修改功能
     * @param devToolsRequest
     * @return
     */

    @PutMapping("/update_init")
    public DevToolsResponse updateInit(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();



        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 修改功能
     * @param devToolsRequest
     * @return
     */
    @PutMapping("/update")
    public DevToolsResponse update(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();

        //2.业务层 操作数据库
        dev_dbfieldlang= dev_dbfieldlangService.update(dev_dbfieldlang);
        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    /**
     * 添加功能
     * @param devToolsRequest
     * @return
     */

    @PostMapping(value="/insert_init")
    public DevToolsResponse insertInit(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 添加功能
     * @param devToolsRequest
     * @return
     */

    @PostMapping(value="/insert")
    public DevToolsResponse insert(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();

        //2.业务层 操作数据库
        dev_dbfieldlang= dev_dbfieldlangService.insert(dev_dbfieldlang);
        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



    /**
     * 删除 初始化
     * @param devToolsRequest
     * @return
     */

    @DeleteMapping("/delete_init")
    public DevToolsResponse deleteInit(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



    /**
     * 删除 执行
     * @param devToolsRequest
     * @return
     */
    @DeleteMapping("/delete")
    public DevToolsResponse delete(DevToolsRequest devToolsRequest) {



        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        //3.业务层 操作数据库
        dev_dbfieldlang= dev_dbfieldlangService.delete(dev_dbfieldlang);
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



    /**
     * 复制 初始化
     * @param devToolsRequest
     * @return
     */
    @DeleteMapping("/copy_init")
    public DevToolsResponse copyInit(DevToolsRequest devToolsRequest) {
        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();


        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    /**
     * 复制 执行
     * @param devToolsRequest
     * @return
     */

    @DeleteMapping("/copy")
    public DevToolsResponse copy(DevToolsRequest devToolsRequest) {



        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        //3.业务层 操作数据库
        dev_dbfieldlang= dev_dbfieldlangService.insert(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



    //    生效/取消生效   审核 /取消审核 / 过账/ 过账还原 / 产生采购入库单&验退单  批次功能
    //    查看采购入库单 第一步 初始化的时候，告诉前端 要开启什么页面，传什么参数
    //    弹窗 输入条件 ，再运行批次  =》   第一步 初始化的时候，告诉前端 要开启什么页面，预设什么值  第二步  批次功能

    /**
     * 删除 执行
     * @param devToolsRequest
     * @return
     */

    @DeleteMapping("/action_init")
    public DevToolsResponse actionInit(DevToolsRequest devToolsRequest) {



        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    /**
     * 删除 执行
     * @param devToolsRequest
     * @return
     */
    @DeleteMapping("/action")
    public DevToolsResponse action(DevToolsRequest devToolsRequest) {




        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }


    // 录入时 过栏位 检查
    // 修改时 过栏位 检查

    @DeleteMapping(value={"/afterfield_oea01" ,"/afterfield_u_oea01","/afterfield_i_oea01"})
    public DevToolsResponse checkOea01(DevToolsRequest devToolsRequest) {




        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }



    // 99. 程序结束/ 超时 调用程序

    @DeleteMapping("/dev_dbfieldlang_close")
    public DevToolsResponse dbfieldlangClose(DevToolsRequest devToolsRequest) {




        // 1. 对 DevToolsRequest 解析，转换为 Dev_dbfieldlang  Dev_dbfieldlangUI
        dev_dbfieldlang = (Dev_dbfieldlang)devToolsRequest.getData();
        dev_dbfieldlangUI = (Dev_dbfieldlangUI)devToolsRequest.getUI();





        // 2. 执行 业务校验

        // 3. 调用 service 方法
        // dto
        dev_dbfieldlangService.delete(dev_dbfieldlang);




        // 4. 构造 DevToolsResponse
        DevToolsResponse devToolsResponse = new DevToolsResponse();

        devToolsResponse.setData(dev_dbfieldlang);
        devToolsResponse.setUI(dev_dbfieldlangUI);

        // 5. 返回 DevToolsResponse
        return  devToolsResponse;
    }

    @PostMapping("/test")
    public DevToolsResponse delete(@RequestBody long[] ids) {

        DevToolsResponse devToolsResponse = new DevToolsResponse();
        return  devToolsResponse;
    }



}
