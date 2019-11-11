package work.devtools.modules.DEV.dao;
import org.springframework.data.jpa.repository.Query;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.pojo.po.T_progactionlang;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_progactionlangPK;

import java.util.List;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_progactionlangDao extends JpaRepository<T_progactionlang, T_progactionlangPK> {

    void deleteByProgactionlang01(String  progactionlang01);

    @Query("SELECT new work.devtools.modules.DEV.pojo.dto.Dev_progactionlang(a.progactionlang01,a.progactionlang02,a.progactionlang03,l.lang02,a.progactionlang04) from T_progactionlang a LEFT JOIN T_lang l on a.progactionlang03=l.lang01 " +
            "where a.progactionlang01 = ?1 and a.progactionlang02 = ?2 ")
    List<Dev_progactionlang> queryProgActionLang(String progCode, String actionCode);

}
