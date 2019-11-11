package work.devtools.modules.DEV.dao;
import org.springframework.data.jpa.repository.Query;
import work.devtools.modules.DEV.pojo.po.T_dbtable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;


/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_dbtableDao extends JpaRepository<T_dbtable,String> {
    /**
     * 查询表信息
     * @param
     * @return
     */
    @Query(value="SELECT t.dbtable01,t.dbtable02,t.dbtable03,t.dbtable04,t.dbtable05,t.dbtable06,t.dbtable07 FROM t_dbtable t WHERE t.dbtable01 =?1", nativeQuery = true)
    Map<String,String> getTable(String dbtable01);

    @Query(value = "SELECT t.dbtable01,t.dbtable02,t.dbtable03,t.dbtable04,t.dbtable05,t.dbtable06,t.dbtable07,\n" +
            "f.dbfield02,f.dbfield03,f.dbfield04,f.dbfield05,f.dbfield06,f.dbfield07 from t_dbtable t LEFT JOIN t_dbfield f on t.dbtable01 = f.dbfield01\n" +
            "WHERE t.dbtable01 = \"t_error\"",nativeQuery = true)
    List<Map<String,String>> findTableInfo(String table);
}
