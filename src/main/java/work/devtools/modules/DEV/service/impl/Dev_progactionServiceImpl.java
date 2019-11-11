package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.dao.T_progactionDao;
import work.devtools.modules.DEV.dao.T_progactionlangDao;
import work.devtools.modules.DEV.mappers.Dev_progactionlangMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_progaction;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.service.Dev_progactionService;

import java.util.List;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_progactionServiceImpl
 * @Description:
 * @date 2019/04/28
 */
@Service
public class Dev_progactionServiceImpl implements Dev_progactionService {

    @Autowired
    private T_progactionDao t_progactionDao;
    @Autowired
    private T_progactionlangDao t_progactionlangDao;

    @Override
    public void delete(List<String> ids) {
//        t_progactionDao.deleteById(ids);
    }

    @Override
    public List<Dev_progaction> queryProgAction(String progCode) {
        return null;
    }

    @Override
    public List<Dev_progactionlang> queryProgActionLang(String progCode,String actionCode) {
        List<Dev_progactionlang> langList = t_progactionlangDao.queryProgActionLang(progCode,actionCode);
        return langList;
    }


    @Override
    public Dev_progaction update(Dev_progactionlang dev_progactionlang) {
        t_progactionlangDao.saveAndFlush(Dev_progactionlangMapper.INSTANCE.Dev_progactionlangToT_progactionlang(dev_progactionlang));
        return null;
    }

    @Override
    public List<Dev_progactionlang> updateBatch(List<Dev_progactionlang> dev_progactionlangs) {
        t_progactionlangDao.saveAll(Dev_progactionlangMapper.INSTANCE.Dev_progactionlangListToT_progactionlangList(dev_progactionlangs));
        return null;
    }
}
