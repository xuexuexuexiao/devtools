package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.service.Dev_legalService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/3/29.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_legalServiceImplTest {

    @Autowired
    private Dev_legalService dev_legalService;

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void test(){
        Dev_legal dev_legal = new Dev_legal();
        dev_legal.setLegal01("005");
        dev_legal.setLegal02("马云爸爸");

        dev_legalService.save(dev_legal);
    }


    @Test
    public void queryTest(){
        Dev_legal dev_legal = new Dev_legal();
        PageRequest pageRequest = new PageRequest(0,4);
        Page<Dev_legal> query = dev_legalService.query(dev_legal, pageRequest);
        System.out.print(query);
    }





}