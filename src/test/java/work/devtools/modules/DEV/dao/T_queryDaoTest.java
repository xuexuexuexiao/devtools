package work.devtools.modules.DEV.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.modules.DEV.mappers.Dev_queryMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_query;


/**
 * Created by 20190301 on 2019/4/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class T_queryDaoTest {

    @Autowired
    private T_queryDao t_queryDao;

    @Test
    public void saveTest(){
        Dev_query dev_query = new Dev_query();
        dev_query.setQuery01("errorQuery");
        dev_query.setQuery03("from t_error e");
        dev_query.setQuery04("where  (ArgWhere[1]) or  (ArgWhere[2])");
        dev_query.setQuery05("order by e.error01");
        t_queryDao.saveAndFlush(Dev_queryMapper.INSTANCE.dev_queryToT_query(dev_query));
    }

    @Test
    public void saveTest1(){
        Dev_query dev_query = new Dev_query();
        dev_query.setQuery01("tableQuery");
        dev_query.setQuery03("from t_dbtable t left join t_dbfield f on t.dbtable01 = f.dbfield01");
        dev_query.setQuery04("where  (ArgWhere[1]) or  (ArgWhere[2])");
        dev_query.setQuery05("order by t.dbtable01");
        t_queryDao.saveAndFlush(Dev_queryMapper.INSTANCE.dev_queryToT_query(dev_query));
    }
}