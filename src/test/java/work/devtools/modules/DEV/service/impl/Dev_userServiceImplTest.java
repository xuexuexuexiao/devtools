package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_user;
import work.devtools.modules.DEV.pojo.po.T_user;
import work.devtools.modules.DEV.service.Dev_userService;

import java.util.Date;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by 20190301 on 2019/4/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_userServiceImplTest {

    @Autowired
    private Dev_userService dev_userService;

    @Test
    public void saveTest(){
        Dev_user dev_user = new Dev_user();
        dev_user.setUser01("003");
        //所属员工编号
        dev_user.setUser02("003");
        dev_user.setUser03("123456");
        dev_user.setUser04(new Date());
        dev_user.setUser05("Y");
        dev_user.setUser06(5);
        dev_user.setUser07(0);
        dev_user.setUser08("Y");
        T_user save = dev_userService.save(dev_user);

//        assertNotEquals(null,save);

    }



    @Test
    public void updateTest(){
        Dev_user dev_user = new Dev_user();
        dev_user.setUser01("003");
        //所属员工编号
        dev_user.setUser02("002");
        dev_user.setUser03("123456");
        dev_user.setUser04(new Date());
        dev_user.setUser05("N");
        dev_user.setUser06(2);
        dev_user.setUser07(0);
        dev_user.setUser08("Y");
        T_user save = dev_userService.save(dev_user);

        assertNotEquals(null,save);
    }

    @Test
    public void queryTest(){
        Dev_user dev_user = new Dev_user();
        dev_user.setUser01("001");
        PageRequest pageRequest = new PageRequest(0,3);
        Page<Dev_user> query = dev_userService.query(dev_user, pageRequest);
        System.out.print(query.getContent());
    }

    @Test
    public void deleteTest(){

    }
}