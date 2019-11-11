package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_role;
import work.devtools.modules.DEV.pojo.po.T_role;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色Service
 * @create: 2019-04-01
 **/
public interface Dev_roleService {
    /**
     * 分页查询
     * @param dev_role
     * @param pageable
     * @return
     */
    Page<Dev_role> query(Dev_role dev_role, Pageable pageable);

    /**
     * 保存或者更新
     * @param dev_role
     * @return
     */
    T_role save(Dev_role dev_role);

    /**
     * 根据角色编号查询角色
     * @param role01
     * @return
     */
    T_role findByRole01(String role01);

    /**
     * 删除角色
     * @param t_role
     */
    void delete(T_role t_role);
}
