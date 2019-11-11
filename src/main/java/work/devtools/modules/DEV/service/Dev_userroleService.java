package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_userrole;
import work.devtools.modules.DEV.pojo.po.T_userrole;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户角色Service
 * @create: 2019-04-01
 **/
public interface Dev_userroleService {
    /**
     * 分页查询
     * @param dev_userrole
     * @param pageable
     * @return
     */
    Page<Dev_userrole> query(Dev_userrole dev_userrole, Pageable pageable);

    /**
     * 保存或者更新
     * @param dev_userrole
     * @return
     */
    T_userrole save(Dev_userrole dev_userrole);

    /**
     * 根据用户编号查找用户角色维护
     * @param userrole01
     * @return
     */
    T_userrole findByUserrole01(String userrole01);

    /**
     * 删除用户角色维护
     * @param t_userrole
     */
    void delete(T_userrole t_userrole);
}
