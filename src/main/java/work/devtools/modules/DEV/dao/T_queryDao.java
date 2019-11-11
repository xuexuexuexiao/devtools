package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_query;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 查询单头Dao
 * @create: 2019-04-16
 **/
@Repository
public interface T_queryDao extends JpaRepository<T_query,String>{
    /**
     * 根据查询编号查询
     * @param query01
     * @return
     */
    T_query findByQuery01(String query01);

}
