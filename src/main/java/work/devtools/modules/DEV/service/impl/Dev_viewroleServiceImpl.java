package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.dao.T_viewroleDao;
import work.devtools.modules.DEV.service.Dev_viewroleService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色界面ServiceImpl
 * @create: 2019-04-02
 **/
@Service
public class Dev_viewroleServiceImpl implements Dev_viewroleService{

    @Autowired
    private T_viewroleDao t_viewroleDao;
}
