package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.dao.T_roleresourcesDao;
import work.devtools.modules.DEV.pojo.dto.Dev_roleresources;
import work.devtools.modules.DEV.pojo.po.T_roleresources;
import work.devtools.modules.DEV.service.Dev_roleresourcesService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色资源ServiceImpl
 * @create: 2019-04-02
 **/
@Service
public class Dev_roleresourcesServiceImpl implements Dev_roleresourcesService{

    @Autowired
    private T_roleresourcesDao t_roleresourcesDao;

    @Override
    public Page<Dev_roleresources> dynamicPageQuery(PageRequest pageRequest, Dev_roleresources dev_roleresources) {
        return null;
    }

    @Override
    public Dev_roleresources save(Dev_roleresources dev_roleresources) {
        return null;
    }

    @Override
    public T_roleresources findByRoleresources01(String roleresources01) {
        return null;
    }

    @Override
    public void delete(String roleresources01) {

    }
}
