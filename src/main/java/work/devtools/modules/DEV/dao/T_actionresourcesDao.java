package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_actionresources;
import work.devtools.modules.DEV.pojo.po.T_actionresourcesPK;

import java.util.List;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_actionresourcesDao extends JpaRepository<T_actionresources, T_actionresourcesPK> {
    /**
     *  根据程序编号删除
     * @param actionresources01
     * @return
     */
    void deleteByActionresources01(String  actionresources01);

    /**
     *  根据程序编号查找
     * @param actionresources01
     * @return
     */
    List<T_actionresources> findByActionresources01(String  actionresources01);

}
