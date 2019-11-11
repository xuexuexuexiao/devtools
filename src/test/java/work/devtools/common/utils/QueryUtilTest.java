package work.devtools.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.service.BaseService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/16.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class QueryUtilTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private BaseService baseService;

    /**
     *
     */
    @Test
    public void test(){
        String queryCode = "errorQuery";
        Map<String,Object> map = new HashMap<>();
        map.put("offset",0);
        map.put("page",10);
        map.put("limit",10);
        map.put("error01","001");
        QueryParams queryParams = new QueryParams(map);
        Page<Object> query = QueryUtil.query(queryCode, queryParams);

        log.info("entityManager2:   ================== "+entityManager.hashCode());

        System.out.println(query.getTotalElements());

        assertNotEquals(0,query.getSize());


    }

    @Test
    public void test2(){
        String queryCode = "errorQuery";
        Map<String,Object> map = new HashMap<>();
        map.put("offset",0);
        map.put("page",10);
        map.put("limit",10);
        //TODO  拆线呢条件oo'n'g'pei'fuo'n'g'pe
        map.put("error01","*01");
        QueryParams queryParams = new QueryParams(map);
        Page query = baseService.query(queryCode, queryParams);

        List content = query.getContent();

        log.info("content:========"+content);


    }



}