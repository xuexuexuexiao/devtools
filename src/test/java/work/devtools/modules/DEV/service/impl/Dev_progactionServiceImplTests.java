package work.devtools.modules.DEV.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.service.Dev_progactionService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Dev_progactionServiceImplTests {
    @Autowired
    private Dev_progactionService dev_progactionService;

    @Test
    public void update(){
        Dev_progactionlang lang = new Dev_progactionlang("dev_prog","query","lang01","简体中文","查询");
        dev_progactionService.update(lang);
    }

    @Test
    public void updateBatch(){
        List list = Lists.newArrayList(
                new Dev_progactionlang("dev_prog","query","lang01","简体中文","查询"),
                new Dev_progactionlang("dev_prog","query","lang02","繁体中文","查詢"),
                new Dev_progactionlang("dev_prog","query","lang03","英文","query")
        );
        dev_progactionService.updateBatch(list);
    }

    @Test
    public void queryProgActionLang(){
        List<Dev_progactionlang> list = dev_progactionService.queryProgActionLang("dev_prog","query");
        log.info(list.size()+"");
        for (Dev_progactionlang lang: list) {
            log.info(lang.toString());
        }


    }

}