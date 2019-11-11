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
import work.devtools.modules.DEV.dao.T_userroleDao;
import work.devtools.modules.DEV.mappers.Dev_userroleMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_userrole;
import work.devtools.modules.DEV.pojo.po.T_userrole;
import work.devtools.modules.DEV.service.Dev_userroleService;

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
 * @desc: 用户角色ServiceImpl
 * @create: 2019-04-01
 **/
@Service
public class Dev_userroleServiceImpl  implements Dev_userroleService{

    @Autowired
    private T_userroleDao t_userroleDao;


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Dev_userrole> query(Dev_userrole dev_userrole, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("SELECT count(1) from  t_userrole ur WHERE 1=1  ");

        StringBuilder selectSql = new StringBuilder();

        selectSql.append("SELECT ur.* from  t_userrole ur WHERE 1=1  ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        //条件判断
        //公司编号
        if(StringUtils.isNotBlank(dev_userrole.getUserrole01())){
            whereSql.append(" and userrole01=:userrole01 ");
            params.put("userrole01",dev_userrole.getUserrole01());
        }
        //公司名称
        if(StringUtils.isNotBlank(dev_userrole.getUserrole02())){
            whereSql.append(" and userrole02=:userrole02 ");
            params.put("userrole02",dev_userrole.getUserrole01());
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

//        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List result = query.getResultList();
        List<Dev_userrole> dev_companyList=new ArrayList<Dev_userrole>();
        for (Object obj : result) {
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
//            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
            Object o = MapObjUtil.mapToObject2(Dev_userrole.class, map);
            dev_companyList.add((Dev_userrole)o);
        }
        Page<Dev_userrole> pageUserrole =new PageImpl<Dev_userrole>(result,pageable,totalCount.longValue());
        return pageUserrole;
    }

    @Override
    @Transactional
    public T_userrole save(Dev_userrole dev_userrole) {
        T_userrole t_userrole = t_userroleDao.saveAndFlush(Dev_userroleMapper.INSTANCE.dev_userToT_user(dev_userrole));
        return t_userrole;
    }

    @Override
    public T_userrole findByUserrole01(String userrole01) {
        T_userrole t_userrole = t_userroleDao.findByUserrole01(userrole01);
        return t_userrole;
    }

    @Override
    @Transactional
    public void delete(T_userrole t_userrole) {
        t_userroleDao.delete(t_userrole);
    }
}
