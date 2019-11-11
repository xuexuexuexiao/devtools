package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_role;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色Dao
 * @create: 2019-04-01
 **/
@Repository
public interface T_roleDao extends JpaRepository<T_role,String>{
    T_role findByRole01(String role01);
}
