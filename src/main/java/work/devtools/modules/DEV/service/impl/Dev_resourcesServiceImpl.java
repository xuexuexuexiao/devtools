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
import work.devtools.modules.DEV.dao.T_resourcesDao;
import work.devtools.modules.DEV.mappers.Dev_resourcesMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_resources;
import work.devtools.modules.DEV.pojo.po.T_resources;
import work.devtools.modules.DEV.service.Dev_resourcesService;

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
 * @desc: 资源ServiceImpl
 * @create: 2019-04-02
 **/
@Service
public class Dev_resourcesServiceImpl implements Dev_resourcesService{

    @Autowired
    private T_resourcesDao t_resourcesDao;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<Dev_resources> dynamicPageQuery(Pageable pageable, Dev_resources dev_resources) {
        StringBuilder countSelectSql = new StringBuilder();
        countSelectSql.append("SELECT count(1) from t_resources r WHERE 1=1 ");

        StringBuilder selectSql = new StringBuilder();

        selectSql.append("SELECT r.resources01,r.resources02 from t_resources r WHERE 1=1 ");

        Map<String,Object> params = new HashMap<>();
        StringBuilder whereSql = new StringBuilder();
        //条件判断
        //公司编号
        if(StringUtils.isNotBlank(dev_resources.getResources01())){
            whereSql.append(" and resources01=:resources01 ");
            params.put("resources01",dev_resources.getResources01());
        }
        //公司名称
        if(StringUtils.isNotBlank(dev_resources.getResources02())){
            whereSql.append(" and resources02=:resources02 ");
            params.put("resources02",dev_resources.getResources02());
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
        List<Dev_resources> dev_companyList=new ArrayList<Dev_resources>();
        for (Object obj : result) {
            Map map = (Map)obj;
//            Dev_company devCompany = MapObjUtil.map2Object(map, Dev_company.class);
//            Dev_company devCompany1 = MapObjUtil.transMapToObj(map, Dev_company.class);
            Object o = MapObjUtil.mapToObject2(Dev_resources.class, map);
//            dev_companyList.add(devCompany1);
            dev_companyList.add((Dev_resources) o);
        }
        Page<Dev_resources> pageDevCompany =new PageImpl<Dev_resources>(result,pageable,totalCount.longValue());
        return pageDevCompany;
    }

    @Override
    @Transactional
    public Dev_resources save(Dev_resources dev_resources) {
        T_resources resources = t_resourcesDao.save(Dev_resourcesMapper.INSTANCE.dev_resourcesToT_resources(dev_resources));
        return Dev_resourcesMapper.INSTANCE.t_resourcesToDev_resources(resources);
    }

    @Override
    public T_resources findByResources01(String resources01) {
        T_resources t_resources = t_resourcesDao.findByResources01(resources01);
        return t_resources;
    }

    @Override
    @Transactional
    public void delete(T_resources t_resources) {
        t_resourcesDao.delete(t_resources);
    }
}
