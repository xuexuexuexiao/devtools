package work.devtools.modules.DEV.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_roleresources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色资源Dao
 * @create: 2019-04-02
 **/
@Repository
public interface T_roleresourcesDao  extends JpaRepository<T_roleresources,String>{
}
