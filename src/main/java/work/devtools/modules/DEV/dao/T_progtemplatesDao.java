package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_progtemplates;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-11
 **/
@Repository
public interface T_progtemplatesDao extends JpaRepository<T_progtemplates,String>{
}
