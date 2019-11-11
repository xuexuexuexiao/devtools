package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.devtools.modules.DEV.service.Dev_dbfieldlangService;
import work.devtools.modules.DEV.dao.T_dbfieldlangDao;
import work.devtools.modules.DEV.mappers.Dev_dbfieldlangMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_dbfieldlang;
import work.devtools.modules.DEV.pojo.po.T_dbfieldlang;

import work.devtools.modules.DEV.web.Dev_dbfieldlangCondition;

import java.util.List;

/**
 * @author Amy_Wang
 * @version V1.0
 * @ClassName:Dev_dbfieldlangServiceImpl
 * @Description:
 * @date 2018/12/28
 */
@Service
public class Dev_dbfieldlangServiceImpl implements Dev_dbfieldlangService {

    @Autowired
    private T_dbfieldlangDao t_dbfieldlangDao;

    @Override
    public List<Dev_dbfieldlang> query(Dev_dbfieldlangCondition dev_dbfieldlangQueryCondition) {
        return null;
    }

    @Override
    public Dev_dbfieldlang insert(Dev_dbfieldlang dto) {

        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库

        T_dbfieldlang t_dbfieldlang = t_dbfieldlangDao.saveAndFlush(Dev_dbfieldlangMapper.INSTANCE.Dev_dbfieldlangToT_dbfieldlang(dto));

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }

    @Override
    public Dev_dbfieldlang delete(Dev_dbfieldlang dto) {
        // 1.dto 业务逻辑计算

        // 2.删除数据库数据
        t_dbfieldlangDao.delete(Dev_dbfieldlangMapper.INSTANCE.Dev_dbfieldlangToT_dbfieldlang(dto));
        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }

    @Override
    public Dev_dbfieldlang update(Dev_dbfieldlang dto) {
        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库
        T_dbfieldlang t_dbfieldlang = t_dbfieldlangDao.saveAndFlush(Dev_dbfieldlangMapper.INSTANCE.Dev_dbfieldlangToT_dbfieldlang(dto));

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }
}
