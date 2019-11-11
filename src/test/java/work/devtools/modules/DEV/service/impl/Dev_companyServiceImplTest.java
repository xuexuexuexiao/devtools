package work.devtools.modules.DEV.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.internal.QueryImpl;
import org.hibernate.transform.Transformers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.utils.MapObjUtil;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.service.Dev_companyService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 20190301 on 2019/3/29.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Dev_companyServiceImplTest {

    @Autowired
    private Dev_companyService dev_companyService;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void saveTest() throws SQLException, IOException, ClassNotFoundException {
        Dev_company devCompany = new Dev_company();
        devCompany.setCompany01("003");
        devCompany.setCompany02("蚂蚁森林有限公司");
        //法人
        devCompany.setCompany09("003");

        dev_companyService.save(devCompany);
    }


    @Test
    public void queryTest(){
        PageRequest request = new PageRequest(0,4);
        Dev_company devCompany = new Dev_company();
        Page<Dev_company> dev_companies = dev_companyService.dynamicPageQuery(request, devCompany);
        log.info("============          "+dev_companies);
//        assertEquals(3,dev_companies);
    }

    /**
     * 动态多条件查询
     * @throws Exception
     */
    @Test
    public void dynamicQueryTest()  throws Exception {
        StringBuilder sb = new StringBuilder();
        String sql = "SELECT c.* ,l.legal02 as legal02 FROM T_company c LEFT JOIN T_legal l ON l.legal01 = c.company09  WHERE 1 = 1  ";
        sb.append(sql);

        javax.persistence.Query query = entityManager.createNativeQuery(sql.toString());
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List list =  query.getResultList();
        List<Dev_company> dev_companyList = new ArrayList<Dev_company>();
        for (Object obj: list){
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
//            Object o = MapObjUtil.mapToObject2(Dev_company.class, map);
            dev_companyList.add(devCompany1);
//            dev_companyList.add((Dev_company)o);
        }
        //TODO  jackjson没有生效
        System.out.println("companyList: "+dev_companyList);
    }

    @Test
    public  void  queryTest2(){
       /* final String hql = "select id as id, name as name from BaseClassBean " +
                " where(id >100100 and id < 100200)or (id >100300 and id < 100400) ";
        return hibernateTemplate.execute(new HibernateCallback() {
            @Override
            public List<Map<String, Object>> doInHibernate(Session session)
                    throws HibernateException {
                return session.createQuery(hql).setMaxResults(10)
                        .setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP).list();
            }

        });*/

    }


    @Test
    public void dbUtilTest() throws SQLException, IOException, ClassNotFoundException {
        Dev_company dev_company =  new Dev_company();
        dev_company.setCompany01("004");
        dev_company.setCompany02("买买买公司");
        dev_company.setCompany09("002");
        dev_companyService.save(dev_company);
    }


}