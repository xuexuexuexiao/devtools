package work.devtools.modules.DEV.dao;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.Query;
import work.devtools.modules.DEV.pojo.po.T_dbfield;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_dbfieldPK;

import java.util.List;
import java.util.Map;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_dbfieldDao extends JpaRepository<T_dbfield, T_dbfieldPK> {
    /**
     * 根据表查询字段：列信息
     * @param
     * @return
     */
    @Query(value = "SELECT f.dbfield01,f.dbfield02,f.dbfield03,f.dbfield04,f.dbfield05,f.dbfield06,f.dbfield07 from t_dbfield  f WHERE f.dbfield01 =?1", nativeQuery = true)
    List<Map<String,String>> getColumList(String dbfield01);

}
