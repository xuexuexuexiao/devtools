package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_group;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 组织Dao
 * @create: 2019-03-31
 **/
@Repository
public interface T_groupDao extends JpaRepository<T_group,String>{
    T_group findByGroup01(String group01);
}
