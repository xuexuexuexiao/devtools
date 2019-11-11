package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_module;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-11
 **/
@Repository
public interface T_moduleDao extends JpaRepository<T_module,String> {

    @Query("select module06 from T_module where module01 = ?1" )
    String findControllerPath(String module01);

}
