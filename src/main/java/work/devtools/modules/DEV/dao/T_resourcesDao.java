package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_resources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 系统资源Dao
 * @create: 2019-04-02
 **/
@Repository
public interface T_resourcesDao  extends JpaRepository<T_resources,String>{
    /**
     *  根据资源编号查找
     * @param resources01
     * @return
     */
    T_resources findByResources01(String resources01);
}
