package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_userrole;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户角色Dao
 * @create: 2019-04-01
 **/
@Repository
public interface T_userroleDao  extends JpaRepository<T_userrole,String>{
    T_userrole findByUserrole01(String userrole01);
}
