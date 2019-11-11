package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_group;
import work.devtools.modules.DEV.service.Dev_groupService;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_groupServiceImplTest {

    @Autowired
    private Dev_groupService dev_groupService;


    @Test
    public void saveTest() throws SQLException, IOException, ClassNotFoundException {
        Dev_group group =  new Dev_group();
        group.setGroup01("006");
        group.setGroup02("业务组6");
        group.setGroup04("002");
        Dev_group save = dev_groupService.save(group);
//        assertNotEquals(null,save);
    }
}