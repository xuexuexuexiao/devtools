package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_actionresources;
import work.devtools.modules.DEV.pojo.po.T_progresources;
import work.devtools.modules.DEV.pojo.po.T_progresourcesPK;

import java.util.List;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_progresourcesDao extends JpaRepository<T_progresources, T_progresourcesPK> {
    /**
     *  根据程序编号删除
     * @param progresources01
     * @return
     */
    void deleteByProgresources01(String  progresources01);

    /**
     *  根据程序编号查询
     * @param progresources01
     * @return
     */
    List<T_progresources> findByProgresources01(String  progresources01);
}
