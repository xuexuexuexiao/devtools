package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_queryline;
import work.devtools.modules.DEV.pojo.po.T_querylinePK;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 查询单身Dao
 * @create: 2019-04-16
 **/
@Repository
public interface T_querylineDao extends JpaRepository<T_queryline,T_querylinePK>{
    /**
     * 根据动态查询编号 查询栏位等信息
     * @param queryCode
     * @return
     */
    List<T_queryline> findByQueryline01(String queryCode);
}
