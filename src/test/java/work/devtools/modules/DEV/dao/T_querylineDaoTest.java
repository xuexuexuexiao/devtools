package work.devtools.modules.DEV.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.pojo.po.T_queryline;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/4/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class T_querylineDaoTest {

    @Autowired
    private T_querylineDao t_querylineDao;


    @Test
    public void saveTest(){
        T_queryline t_queryline = new T_queryline();
        t_queryline.setQueryline01("errorQuery");
        t_queryline.setQueryline02("error01");
        t_queryline.setQueryline04("e");
        t_queryline.setQueryline05("t_error");
        t_queryline.setQueryline06("error01");
        t_queryline.setQueryline07("varchar");
        t_queryline.setQueryline08("Y");
        t_queryline.setQueryline09("ArgWhere[1]");


        T_queryline t_queryline2 = new T_queryline();
        t_queryline2.setQueryline01("errorQuery");
        t_queryline2.setQueryline02("error02");
        t_queryline2.setQueryline04("e");
        t_queryline2.setQueryline05("t_error");
        t_queryline2.setQueryline06("error02");
        t_queryline2.setQueryline07("varchar");
        t_queryline2.setQueryline08("Y");
        t_queryline2.setQueryline09("ArgWhere[1]");


        T_queryline t_queryline3 = new T_queryline();
        t_queryline3.setQueryline01("errorQuery");
        t_queryline3.setQueryline02("error03");
        t_queryline3.setQueryline04("e");
        t_queryline3.setQueryline05("t_error");
        t_queryline3.setQueryline06("error03");
        t_queryline3.setQueryline07("varchar");
        t_queryline3.setQueryline08("Y");
        t_queryline3.setQueryline09("ArgWhere[2]");




        t_querylineDao.saveAndFlush(t_queryline);
        t_querylineDao.saveAndFlush(t_queryline3);
        t_querylineDao.saveAndFlush(t_queryline2);
    }



    @Test
    public void saveTest2(){
        T_queryline t_queryline = new T_queryline();
        t_queryline.setQueryline01("tableQuery");
        t_queryline.setQueryline02("dbtable01");
        t_queryline.setQueryline04("t");
        t_queryline.setQueryline05("t_dbtable");
        t_queryline.setQueryline06("dbtable01");
        t_queryline.setQueryline07("varchar");
        t_queryline.setQueryline08("Y");
        t_queryline.setQueryline09("ArgWhere[1]");


        T_queryline t_queryline2 = new T_queryline();
        t_queryline2.setQueryline01("tableQuery");
        t_queryline2.setQueryline02("dbtable02");
        t_queryline2.setQueryline04("t");
        t_queryline2.setQueryline05("t_dbtable");
        t_queryline2.setQueryline06("dbtable02");
        t_queryline2.setQueryline07("varchar");
        t_queryline2.setQueryline08("Y");
        t_queryline2.setQueryline09("ArgWhere[1]");


        T_queryline t_queryline3 = new T_queryline();
        t_queryline3.setQueryline01("tableQuery");
        t_queryline3.setQueryline02("dbfield01");
        t_queryline3.setQueryline04("f");
        t_queryline3.setQueryline05("t_dbfield");
        t_queryline3.setQueryline06("dbfield01");
        t_queryline3.setQueryline07("varchar");
        t_queryline3.setQueryline08("Y");
        t_queryline3.setQueryline09("ArgWhere[2]");

        T_queryline t_queryline4 = new T_queryline();
        t_queryline4.setQueryline01("tableQuery");
        t_queryline4.setQueryline02("dbfield02");
        t_queryline4.setQueryline04("f");
        t_queryline4.setQueryline05("t_dbfield");
        t_queryline4.setQueryline06("dbfield02");
        t_queryline4.setQueryline07("varchar");
        t_queryline4.setQueryline08("Y");
        t_queryline4.setQueryline09("ArgWhere[2]");


        T_queryline t_queryline9 = new T_queryline();
        t_queryline9.setQueryline01("tableQuery");
        t_queryline9.setQueryline02("dbfield03");
        t_queryline9.setQueryline04("f");
        t_queryline9.setQueryline05("t_dbfield");
        t_queryline9.setQueryline06("dbfield03");
        t_queryline9.setQueryline07("varchar");
        t_queryline9.setQueryline08("Y");
        t_queryline9.setQueryline09("ArgWhere[2]");

        T_queryline t_queryline5 = new T_queryline();
        t_queryline5.setQueryline01("tableQuery");
        t_queryline5.setQueryline02("dbfield04");
        t_queryline5.setQueryline04("f");
        t_queryline5.setQueryline05("t_dbfield");
        t_queryline5.setQueryline06("dbfield04");
        t_queryline5.setQueryline07("varchar");
        t_queryline5.setQueryline08("Y");
        t_queryline5.setQueryline09("ArgWhere[2]");


        T_queryline t_queryline6 = new T_queryline();
        t_queryline6.setQueryline01("tableQuery");
        t_queryline6.setQueryline02("dbfield05");
        t_queryline6.setQueryline04("f");
        t_queryline6.setQueryline05("t_dbfield");
        t_queryline6.setQueryline06("dbfield05");
        t_queryline6.setQueryline07("varchar");
        t_queryline6.setQueryline08("Y");
        t_queryline6.setQueryline09("ArgWhere[2]");


        T_queryline t_queryline7 = new T_queryline();
        t_queryline7.setQueryline01("tableQuery");
        t_queryline7.setQueryline02("dbfield06");
        t_queryline7.setQueryline04("f");
        t_queryline7.setQueryline05("t_dbfield");
        t_queryline7.setQueryline06("dbfield06");
        t_queryline7.setQueryline07("varchar");
        t_queryline7.setQueryline08("Y");
        t_queryline7.setQueryline09("ArgWhere[2]");

        T_queryline t_queryline8 = new T_queryline();
        t_queryline8.setQueryline01("tableQuery");
        t_queryline8.setQueryline02("dbfield07");
        t_queryline8.setQueryline04("f");
        t_queryline8.setQueryline05("t_dbfield");
        t_queryline8.setQueryline06("dbfield07");
        t_queryline8.setQueryline07("varchar");
        t_queryline8.setQueryline08("Y");
        t_queryline8.setQueryline09("ArgWhere[2]");



        t_querylineDao.saveAndFlush(t_queryline);
        t_querylineDao.saveAndFlush(t_queryline3);
        t_querylineDao.saveAndFlush(t_queryline2);

        t_querylineDao.saveAndFlush(t_queryline4);
        t_querylineDao.saveAndFlush(t_queryline5);
        t_querylineDao.saveAndFlush(t_queryline6);
        t_querylineDao.saveAndFlush(t_queryline7);
        t_querylineDao.saveAndFlush(t_queryline8);
        t_querylineDao.saveAndFlush(t_queryline9);


    }
}