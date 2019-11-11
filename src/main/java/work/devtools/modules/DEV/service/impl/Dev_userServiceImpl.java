package work.devtools.modules.DEV.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.common.utils.MapObjUtil;
import work.devtools.modules.DEV.dao.T_userDao;
import work.devtools.modules.DEV.mappers.Dev_userMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_user;
import work.devtools.modules.DEV.pojo.po.T_user;
import work.devtools.modules.DEV.service.Dev_userService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户ServiceImpl
 * @create: 2019-04-01
 **/
@Service
public class Dev_userServiceImpl implements Dev_userService{

    @Autowired
    private T_userDao t_userDao;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Dev_user> query(Dev_user dev_user, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("SELECT count(1) from t_user u WHERE 1=1  ");

        StringBuilder selectSql = new StringBuilder();

        selectSql.append("SELECT u.user01,u.user02,u.user03,u.user04,u.user05,u.user06,u.user07,u.user08,u.user09,u.user10,u.user11 from t_user u WHERE 1=1  ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        //条件判断
        //
        if(StringUtils.isNotBlank(dev_user.getUser01())){
            whereSql.append(" and user01=:user01 ");
            params.put("user01",dev_user.getUser01());
        }
        //
        if(StringUtils.isNotBlank(dev_user.getUser02())){
            whereSql.append(" and user02=:user02 ");
            params.put("user02",dev_user.getUser02());
        }
        //TODO 多个条件判断的补充

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
        List<Dev_user> dev_companyList=new ArrayList<Dev_user>();
        for (Object obj : result) {
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
//            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
            Object o = MapObjUtil.mapToObject2(Dev_user.class, map);
//            dev_companyList.add(devCompany1);
            dev_companyList.add((Dev_user)o);
        }
        Page<Dev_user> pageDevUser =new PageImpl<Dev_user>(result,pageable,totalCount.longValue());
        return pageDevUser;
    }

    @Override
    @Transactional
    public T_user save(Dev_user dev_user) {
        T_user t_user = t_userDao.saveAndFlush(Dev_userMapper.INSTANCE.dev_userToT_user(dev_user));
        return t_user;
    }

    @Override
    public T_user findByUser01(String user01) {
        return t_userDao.findByUser01(user01);
    }

    @Override
    @Transactional
    public void delete(T_user t_user) {
        t_userDao.delete(t_user);
    }
}
