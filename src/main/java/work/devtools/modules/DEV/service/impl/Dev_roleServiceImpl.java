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
import work.devtools.modules.DEV.dao.T_roleDao;
import work.devtools.modules.DEV.mappers.Dev_roleMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_role;
import work.devtools.modules.DEV.pojo.po.T_role;
import work.devtools.modules.DEV.service.Dev_roleService;

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
 * @desc: 角色ServiceImpl
 * @create: 2019-04-01
 **/
@Service
public class Dev_roleServiceImpl implements Dev_roleService{

    @Autowired
    private T_roleDao t_roleDao;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Dev_role> query(Dev_role dev_role, Pageable pageable) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("SELECT  count(1) from t_role r WHERE 1=1  ");

        StringBuilder selectSql = new StringBuilder();

        selectSql.append("SELECT  r.role01,r.role02,r.role03,r.role04 from t_role r WHERE 1=1  ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        //条件判断
        //
        if(StringUtils.isNotBlank(dev_role.getRole01())){
            whereSql.append(" and role01=:role01 ");
            params.put("role01",dev_role.getRole01());
        }
        //
        if(StringUtils.isNotBlank(dev_role.getRole02())){
            whereSql.append(" and role02=:role02 ");
            params.put("role02",dev_role.getRole02());
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

        query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List result = query.getResultList();
        List<Dev_role> dev_companyList=new ArrayList<Dev_role>();
        for (Object obj : result) {
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
//            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
            Object o = MapObjUtil.mapToObject2(Dev_role.class, map);
            dev_companyList.add((Dev_role)o);
        }
        Page<Dev_role> pageDevRole =new PageImpl<Dev_role>(result,pageable,totalCount.longValue());
        return pageDevRole;
    }

    @Override
    @Transactional
    public T_role save(Dev_role dev_role) {
        T_role t_role = t_roleDao.saveAndFlush(Dev_roleMapper.INSTANCE.dev_roleToT_role(dev_role));
        return t_role;
    }

    @Override
    public T_role findByRole01(String role01) {
        T_role t_role = t_roleDao.findByRole01(role01);
        return t_role;
    }

    @Override
    @Transactional
    public void delete(T_role t_role) {
        t_roleDao.delete(t_role);
    }
}
