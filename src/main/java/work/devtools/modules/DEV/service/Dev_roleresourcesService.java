package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import work.devtools.modules.DEV.pojo.dto.Dev_roleresources;
import work.devtools.modules.DEV.pojo.po.T_roleresources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色资源Service
 * @create: 2019-04-02
 **/
public interface Dev_roleresourcesService {
    Page<Dev_roleresources> dynamicPageQuery(PageRequest pageRequest, Dev_roleresources dev_roleresources);

    Dev_roleresources save(Dev_roleresources dev_roleresources);

    T_roleresources findByRoleresources01(String roleresources01);

    void delete(String roleresources01);
}
