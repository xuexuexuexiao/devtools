package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_resources;
import work.devtools.modules.DEV.pojo.po.T_resources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 系统资源Service
 * @create: 2019-04-02
 **/
public interface Dev_resourcesService {

    /**
     * 分页查询
     * @param pageable
     * @param dev_resources
     * @return
     */
    Page<Dev_resources> dynamicPageQuery(Pageable pageable, Dev_resources dev_resources);

    /**
     * 保存或者更新
     * @param dev_resources
     * @return
     */
    Dev_resources save(Dev_resources dev_resources);

    /**
     * 根据资源编号查找
     * @param resources01
     * @return
     */
    T_resources findByResources01(String resources01);

    /**
     * 删除
     * @param t_resources
     */
    void delete(T_resources t_resources);
}
