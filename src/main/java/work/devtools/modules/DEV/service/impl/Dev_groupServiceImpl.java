package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.common.utils.DbUtil;
import work.devtools.modules.DEV.dao.T_groupDao;
import work.devtools.modules.DEV.mappers.Dev_groupMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_group;
import work.devtools.modules.DEV.pojo.po.T_group;
import work.devtools.modules.DEV.service.Dev_groupService;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 组织ServiceImpl
 * @create: 2019-03-31
 **/
@Service
public class Dev_groupServiceImpl implements Dev_groupService{

    @Autowired
    private T_groupDao t_groupDao;

    @Override
    public Page<Dev_group> dynamicPageQuery(PageRequest pageRequest, Dev_group dev_group) {
        return null;
    }

    @Override
    public Dev_group save(Dev_group dev_group) throws SQLException, IOException, ClassNotFoundException {
        //  dbUtil.saveAndFlush(Dev_group dto,String tableName);

        //  dbUtil.saveAndFlush(T dto,String tableName);
        //   1) tableName对应的PO   Dev_groupMapper.INSTANCE.dev_group2T_group(dev_group)
        //        1.1)  Dev_groupMapper.INSTANCE.dev_group2T_group(dev_group)
        //                 ApplicationContext
        //   2) tableName对应的Dao  ，调用 dao的saveAndFlush
        //
//        DbUtil.saveAndFlush(Dev_groupMapper.INSTANCE.dev_groupToT_group(dev_group),"t_groupDao");
//        T_group t_group = t_groupDao.saveAndFlush(Dev_groupMapper.INSTANCE.dev_groupToT_group(dev_group));
        //get("tableName"+"Dao").saveAndFlush();
        return null;
    }

    @Override
    public T_group findByGroup01(String group01) {
        T_group t_group = t_groupDao.findByGroup01(group01);
        return t_group;
    }

    @Override
    @Transactional
    public void delete(String group01) {
        t_groupDao.deleteById(group01);
    }
}
