package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.mappers.Dev_moduleMapper;
import work.devtools.modules.DEV.pojo.po.T_module;
import work.devtools.modules.DEV.dao.T_moduleDao;
import work.devtools.modules.DEV.pojo.dto.Dev_module;
import work.devtools.modules.DEV.service.Dev_moduleService;

import java.util.List;

/**
 * @Description:
 * @Author: CPQ
 * @date: 2019/4/18 0018 上午 10:27
 * @Version: 1.0
 */
@Service
public class Dev_moduleServiceImpl implements Dev_moduleService {

    @Autowired
    private T_moduleDao t_moduleDao;

    @Override
    public List<Dev_module> query(Object obj) {
        return null;
    }

    @Override
    public Dev_module insert(Dev_module dto) {

        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库
        T_module t_module = t_moduleDao.saveAndFlush(Dev_moduleMapper.INSTANCE.Dev_moduleToT_module(dto));

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }

    @Override
    public void delete(Dev_module dto) {
        // 1.dto 业务逻辑计算

        // 2.删除数据库数据
        t_moduleDao.delete(Dev_moduleMapper.INSTANCE.Dev_moduleToT_module(dto));
    }

    @Override
    public Dev_module update(Dev_module dto) {
        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库
        T_module t_module = t_moduleDao.saveAndFlush(Dev_moduleMapper.INSTANCE.Dev_moduleToT_module(dto));

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }
}
