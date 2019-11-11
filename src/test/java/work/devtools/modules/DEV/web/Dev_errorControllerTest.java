package work.devtools.modules.DEV.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.domain.ui.ElementUIInput;
import work.devtools.modules.DEV.service.Dev_errorService;
import work.devtools.modules.DEV.service.Dev_viewcontrolService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/15.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class  Dev_errorControllerTest {

    @Autowired
    private Dev_viewcontrolService dev_viewcontrolService;

    @Test
    public void test(){
        List<ElementUIInput> error001 = dev_viewcontrolService.findByViewcontrol01("error001");
        System.out.println(error001);
    }

}