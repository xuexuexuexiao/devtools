package work.devtools.modules.DEV.dao;
import org.springframework.data.jpa.repository.Query;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.pojo.dto.Dev_proglang;
import work.devtools.modules.DEV.pojo.po.T_proglang;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_proglangPK;

import java.util.List;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_proglangDao extends JpaRepository<T_proglang, T_proglangPK> {
    /**
     *  根据程序编号删除
     * @param proglang01
     * @return
     */
    void deleteByProglang01(String  proglang01);

    @Query("SELECT new work.devtools.modules.DEV.pojo.dto.Dev_proglang(a.proglang01,a.proglang02,a.proglang03,l.lang02) from T_proglang a LEFT JOIN T_lang l on a.proglang02=l.lang01 " +
            "where a.proglang01 = ?1 ")
    List<Dev_proglang> queryProgLang(String progCode);
}
