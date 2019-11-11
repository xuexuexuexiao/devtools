package work.devtools.modules.DEV.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.pojo.dto.Dev_tableField;
import work.devtools.modules.DEV.service.BaseService;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BaseServiceImplTest {

    @Autowired
    private BaseService baseService;

    @Test
    public void test(){
        String queryCode = "errorQuery";
        Map<String,Object> map = new HashMap<>();
        map.put("offset",0);
        map.put("page",10);
        map.put("limit",10);
        map.put("error01","=001");
        QueryParams queryParams = new QueryParams(map);
        Page query1 = baseService.query(queryCode, queryParams);
//        Page<Object> query = QueryUtil.query(queryCode, queryParams);

        String jsonStr = JSON.toJSONString(query1.getTotalElements());
        Dev_tableField dev_tableField = JSON.parseObject(jsonStr, Dev_tableField.class);

        System.out.println(query1.getTotalElements());

        assertNotEquals(0,query1.getSize());
    }

    @Test
    public void jsonTest(){

        String queryCode = "tableQuery";
        Map<String,Object> map = new HashMap<>();
        map.put("offset",0);
        map.put("page",10);
        map.put("limit",10);
        map.put("dbtable01","=t_error");
        QueryParams queryParams = new QueryParams(map);
        Page query1 = baseService.query(queryCode, queryParams);


        Object o = JSON.toJSON(query1.getContent());

//        List list = new ArrayList();
        Dev_tableField dev_tableField = new Gson().fromJson(new JSONArray(query1.getContent()).toJSONString(), Dev_tableField.class);

        log.info("dev_tableField:  ============   "+dev_tableField);
        /*String jsonStr = "{"+JSON.toJSONString(o)+"}";

        Dev_tableField dev_tableField = JSON.parseObject(jsonStr, Dev_tableField.class);
        log.info("dev_tableField : ===========    "+ dev_tableField);*/

        System.out.println(query1.getTotalElements());

        assertNotEquals(0,query1.getSize());

    }

}