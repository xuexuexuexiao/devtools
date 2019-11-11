package work.devtools.modules.DEV.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.dao.T_errorDao;
import work.devtools.modules.DEV.pojo.po.T_error;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/15.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Dev_errorServiceImplTest {

    @Autowired
    private T_errorDao t_errorDao;

    @Test
    public void saveTest(){
        T_error t_error = new T_error();
        t_error.setError01("001");
        t_error.setError02("1");
        t_error.setError03("快说，你错了 !");
        t_errorDao.saveAndFlush(t_error);


        T_error t_error2 = new T_error();
        t_error2.setError01("002");
        t_error2.setError02("2");
        t_error2.setError03("say，you are wrong !");
        t_errorDao.saveAndFlush(t_error2);


        T_error t_error3 = new T_error();
        t_error3.setError01("003");
        t_error3.setError02("1");
        t_error3.setError03("添加成功 !");
        t_errorDao.saveAndFlush(t_error3);


        T_error t_error4 = new T_error();
        t_error4.setError01("004");
        t_error4.setError02("2");
        t_error4.setError03("success adding !");
        t_errorDao.saveAndFlush(t_error4);
    }

}