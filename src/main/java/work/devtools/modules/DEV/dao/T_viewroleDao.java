package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_viewrole;
import work.devtools.modules.DEV.pojo.po.T_viewrolePK;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色界面Dao
 * @create: 2019-04-02
 **/
@Repository
public interface T_viewroleDao extends JpaRepository<T_viewrole,T_viewrolePK>{
}
