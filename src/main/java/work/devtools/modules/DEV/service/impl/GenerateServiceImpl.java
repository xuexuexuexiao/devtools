package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.devtools.common.utils.GeneratorUtils;
import work.devtools.modules.DEV.dao.T_dbfieldDao;
import work.devtools.modules.DEV.dao.T_dbtableDao;
import work.devtools.modules.DEV.pojo.po.T_dbfield;
import work.devtools.modules.DEV.pojo.po.T_dbtable;
import work.devtools.modules.DEV.service.GenerateService;

import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: Generator代码生成Service实现类
 * @create: 2019-04-23
 **/
@Service
public class GenerateServiceImpl implements GenerateService{

    @Autowired
    private T_dbfieldDao t_dbfieldDao;

    @Autowired
    private T_dbtableDao t_dbtableDao;

    @Override
    public void generateCode(String table) {


        //表信息
        Map<String, String> tableMap = t_dbtableDao.getTable(table);
        //表列信息
        List<Map<String, String>> columList = t_dbfieldDao.getColumList(table);

        GeneratorUtils.generateCode(tableMap,columList);
    }

    @Override
    public List<Map<String, String>> findTableInfo(String table) {
        List<Map<String, String>>  list = t_dbtableDao.findTableInfo(table);
        return list;
    }
}
