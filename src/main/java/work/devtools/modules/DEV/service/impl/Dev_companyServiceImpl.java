package work.devtools.modules.DEV.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.common.utils.DbUtil;
import work.devtools.common.utils.MapObjUtil;
import work.devtools.modules.DEV.dao.T_companyDao;
import work.devtools.modules.DEV.mappers.Dev_companyMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.po.T_company;
import work.devtools.modules.DEV.service.Dev_companyService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 公司资料ServiceImpl
 * @create: 2019-03-29
 **/
@Service
public class Dev_companyServiceImpl implements Dev_companyService{

    @Autowired
    private T_companyDao t_companyDao;

    @Override
//    @Transactional
    public T_company save(Dev_company dev_company) throws SQLException, IOException, ClassNotFoundException {
//        DbUtil.saveAndFlush(Dev_companyMapper.INSTANCE.dev_companyToT_company(dev_company),"t_companyDao");
//
//        DbUtil.saveAndFlush(dev_company,"t_company");


        return t_companyDao.save(Dev_companyMapper.INSTANCE.dev_companyToT_company(dev_company));
//        return Dev_companyMapper.INSTANCE.t_company2Dev_company(t_company);


    }

    @Override
    @Transactional
    public void delete(T_company t_company) {
        t_companyDao.delete(t_company);
    }

    @Override
    public T_company findByCompany01(String company01) {
        return t_companyDao.findByCompany01(company01);
    }

    @Override
    public Page<Dev_company> query(Dev_company dev_company, Pageable pageable) {
        T_company t_company = Dev_companyMapper.INSTANCE.dev_companyToT_company(dev_company);
        Example ex = Example.of(t_company);
        Page<T_company> t_companyList = t_companyDao.findAll(ex,pageable);
        List<Dev_company> dev_companyList = new ArrayList<>();
        for(T_company t_company1:t_companyList){
            dev_companyList.add(Dev_companyMapper.INSTANCE.t_companyToDev_company(t_company1));
        }
        return new PageImpl<Dev_company>(dev_companyList,pageable,t_companyList.getTotalElements());
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Dev_company> dynamicPageQuery(Pageable pageable, Dev_company dev_company) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("SELECT count(1) FROM t_company c LEFT JOIN t_legal l ON l.legal01 = c.company09  WHERE 1 = 1  ");

        StringBuilder selectSql = new StringBuilder();

        selectSql.append("SELECT c.company01 AS company01,c.company02 AS company02,l.legal02 AS legal02,c.company09 as company09,l.legal01 as legal01 ,c.company03 as company03  FROM T_company c LEFT JOIN T_legal l ON l.legal01 = c.company09  WHERE 1 = 1  ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        //条件判断
        //公司编号
        if(StringUtils.isNotBlank(dev_company.getCompany01())){
            whereSql.append(" and company01=:company01 ");
            params.put("company01",dev_company.getCompany01());
        }
        //公司名称
        if(StringUtils.isNotBlank(dev_company.getCompany02())){
            whereSql.append(" and company02=:company02 ");
            params.put("company02",dev_company.getCompany02());
        }
        //TODO 多个条件判断后的补充

        String countSql = new StringBuilder().append(countSelectSql).append(whereSql).toString();
        Query countQuery = entityManager.createNativeQuery(countSql);


        for(Map.Entry<String,Object> entry:params.entrySet()){
            countQuery.setParameter(entry.getKey(),entry.getValue());
        }
        BigInteger totalCount = (BigInteger)countQuery.getSingleResult();

        String querySql = new StringBuilder().append(selectSql).append(whereSql).toString();

        javax.persistence.Query  query = this.entityManager.createNativeQuery(querySql);
        for(Map.Entry<String,Object> entry:params.entrySet()){
            query.setParameter(entry.getKey(),entry.getValue());
        }
        query.setFirstResult((int)pageable.getOffset());
        query.setMaxResults(pageable.getPageSize());

//        query.unwrap(NativeQuery.class).addEntity("c",T_company.class).addEntity("l",T_legal.class);
//        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List result = query.getResultList();
        List<Dev_company> dev_companyList=new ArrayList <Dev_company>();
        for (Object obj : result) {
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
//            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
            Object o = MapObjUtil.mapToObject2(Dev_company.class, map);
//            dev_companyList.add(devCompany1);
            dev_companyList.add((Dev_company)o);
        }
        Page<Dev_company> pageDevCompany =new PageImpl <Dev_company>(result,pageable,totalCount.longValue());
        return pageDevCompany;
    }


}
