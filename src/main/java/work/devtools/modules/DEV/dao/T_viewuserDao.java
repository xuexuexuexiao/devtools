package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_viewrolePK;
import work.devtools.modules.DEV.pojo.po.T_viewuser;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-04
 **/
@Repository
public interface T_viewuserDao extends JpaRepository<T_viewuser,T_viewrolePK>{
}
