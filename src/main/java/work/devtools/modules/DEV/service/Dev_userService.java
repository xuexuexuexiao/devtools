package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_user;
import work.devtools.modules.DEV.pojo.po.T_user;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户Service
 * @create: 2019-04-01
 **/
public interface Dev_userService {
    /**
     * 分页查询
     * @param dev_user
     * @param pageable
     * @return
     */
    Page<Dev_user> query(Dev_user dev_user, Pageable pageable);

    /**
     * 保存或者更新
     * @param dev_user
     * @return
     */
    T_user save(Dev_user dev_user);

    /**
     * 根据用户编号查找用户
     * @param user01
     * @return
     */
    T_user findByUser01(String user01);

    /**
     * 根据用户删除用户
     * @param t_user
     */
    void delete(T_user t_user);
}
