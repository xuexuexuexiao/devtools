package work.devtools.modules.DEV.dao;
import org.springframework.data.jpa.repository.Query;
import work.devtools.modules.DEV.pojo.dto.Dev_progaction;
import work.devtools.modules.DEV.pojo.po.T_progaction;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_progactionPK;

import java.util.List;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_progactionDao extends JpaRepository<T_progaction, T_progactionPK> {

    /**
     *  根据程序编号删除
     * @param progaction01
     * @return
     */
    void deleteByProgaction01(String  progaction01);


    @Query("SELECT new work.devtools.modules.DEV.pojo.dto.Dev_progaction(p.progaction01,p.progaction02,r.resources03,l.progactionlang03,l.progactionlang04) FROM " +
            "T_progaction p " +
            "LEFT JOIN T_actionresources ar on p.progaction01 = ar.actionresources01 and p.progaction02 = ar.actionresources02 " +
            "LEFT JOIN T_resources r on ar.actionresources03 = r.resources01 " +
            "LEFT JOIN T_progactionlang l on p.progaction01 = l.progactionlang01 and p.progaction02 = l.progactionlang02 " +
            "where " +
            " l.progactionlang03 = ?1 and p.progaction01 = ?2")
    List<Dev_progaction> listProgactionByProgCode(String lang,String progCode);
}
