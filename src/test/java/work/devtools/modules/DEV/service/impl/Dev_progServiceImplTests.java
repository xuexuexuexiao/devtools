package work.devtools.modules.DEV.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.dao.T_progactionDao;
import work.devtools.modules.DEV.pojo.dto.Dev_prog;
import work.devtools.modules.DEV.pojo.dto.Dev_progaction;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.pojo.dto.Dev_proglang;
import work.devtools.modules.DEV.service.Dev_progService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Dev_progServiceImplTests {
    @Autowired
    private Dev_progService dev_progService;
    @Autowired
    private T_progactionDao t_progactionDao;

    @Test
    public void insert() {
        log.info("--------------------测试log");
        Dev_prog dev_prog = new Dev_prog();
        dev_prog.setProg01("dev_prog");
        dev_prog.setProg02("DEV");
        dev_prog.setProg03("d");
        dev_prog.setProg04("PS");
        dev_prog.setProg05("");
        dev_prog.setProg06("Dev_progController");
        dev_prog.setProg07("Dev_progService");

        dev_progService.insert(dev_prog);
    }

    /**
     *  生成按钮
     * @return
     */
    @Test
    public void handleProgActionList() {
        log.info("--------------------测试log");
//        String progCode = "dev_prog";
        String progCode = "dev_dbfieldlang";
        dev_progService.handleProgActionList(progCode);
    }

    /**
     *  程序国际化列表
     * @return
     */
    @Test
    public void queryProgLang(){
        List<Dev_proglang> list =dev_progService.queryProgLang("dev_prog");
        list.stream().forEach(lang->{
                log.info(lang.toString());
        });
    }

    /**
     *  修改程序国际化
     * @return
     */
    @Test
    public void update(){
        Dev_proglang lang = new Dev_proglang("dev_prog","lang01","简体中文","程序");
        dev_progService.updateProgLang(lang);
    }

    /**
     *  批量修改程序国际化
     * @return
     */
    @Test
    public void updateBatch(){
        List list = Lists.newArrayList(
                new Dev_proglang("dev_prog","lang01","简体中文","程序"),
                new Dev_proglang("dev_prog","lang02","繁体中文","程序"),
                new Dev_proglang("dev_prog","lang03","英文","program")
        );
        dev_progService.updateProgLangBatch(list);
    }
    /**
     *  按钮清单
     * @return
     */
    @Test
    public void listProgAction(){
        List<Dev_progaction> list = t_progactionDao.listProgactionByProgCode("lang01","dev_prog");
        list.stream().forEach(action->{
            log.info(action.toString());
        });
        log.info(list.size()+"");
    }

}