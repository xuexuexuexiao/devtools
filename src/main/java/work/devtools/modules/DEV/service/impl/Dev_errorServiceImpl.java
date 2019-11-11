package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.common.utils.DbUtil;
import work.devtools.common.utils.QueryUtil;
import work.devtools.modules.DEV.dao.T_errorDao;
import work.devtools.modules.DEV.mappers.Dev_errorMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_error;
import work.devtools.modules.DEV.pojo.po.T_error;
import work.devtools.modules.DEV.service.Dev_errorService;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Service
public class Dev_errorServiceImpl implements Dev_errorService {
    @Autowired
    private T_errorDao t_errorDao;

    @Override
    public Page<Dev_error> query(String queryCode, QueryParams queryParams) {
        Page<Object> error01 = QueryUtil.query(queryCode, queryParams);
        List<Object> content = error01.getContent();
        //最终的返回结果，根据业务场景返回
        return null;
    }

    @Override
    public T_error save(Dev_error dev_error) {
//        DbUtil.saveAndFlush();
//        t_errorDao.fin
        return t_errorDao.saveAndFlush(Dev_errorMapper.INSTANCE.dev_errorToT_error(dev_error));
    }

    @Override
    public T_error findByError01(String error01) {
        return null;
    }

    @Override
    public void delete(T_error t_error) {

    }
}
