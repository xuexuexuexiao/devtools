package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_department;
import work.devtools.modules.DEV.service.Dev_departmentService;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_departmentServiceImplTest {

    @Autowired
    private Dev_departmentService dev_departmentService;

    @Test
    public void saveTest(){
        Dev_department dev_department =  new Dev_department();
        dev_department.setDepartment01("004");
        dev_department.setDepartment02("市场部");
        dev_department.setDepartment04("003");
        dev_departmentService.save(dev_department);
    }

}