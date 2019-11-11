package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_user;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户Dao
 * @create: 2019-04-01
 **/
@Repository
public interface T_userDao extends JpaRepository<T_user,String>{
    T_user findByUser01(String user01);

    /**
     * 根据用户编号查询默认国际化语言
     */
    @Query("select user11 from T_user where user01 = ?1")
    String queryLocale(String user01);
}
