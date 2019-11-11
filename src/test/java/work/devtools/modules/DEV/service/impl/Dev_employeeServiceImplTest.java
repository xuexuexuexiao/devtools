package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_employee;
import work.devtools.modules.DEV.service.Dev_employeeService;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_employeeServiceImplTest {

    @Autowired
    private Dev_employeeService dev_employeeService;

    @Test
    public void saveTest(){
        Dev_employee dev_employee = new Dev_employee();
        dev_employee.setEmployee01("003");
        dev_employee.setEmployee02("李晨");
        dev_employee.setEmployee04("003");
//        dev_employee.setEmployee05(0);
        dev_employeeService.save(dev_employee);
    }
}