package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_userrole;
import work.devtools.modules.DEV.service.Dev_userroleService;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_userroleServiceImplTest {

    @Autowired
    private Dev_userroleService dev_userroleService;

    @Test
    public  void  saveTest(){
        Dev_userrole userrole = new Dev_userrole();
        userrole.setUserrole01("001");
        userrole.setUserrole02("002");
        userrole.setUserrole03("采购员");
//        userrole.setUserrole04("001");
        dev_userroleService.save(userrole);
    }


    @Test
    public void updateTest(){

    }


    @Test
    public  void queryTest(){
        Dev_userrole userrole = new Dev_userrole();
        userrole.setUserrole01("001");
        PageRequest pageRequest = new PageRequest(0,3);
        Page<Dev_userrole> query = dev_userroleService.query(userrole, pageRequest);
        System.out.print(query.getContent());
    }


}