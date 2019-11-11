package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_error;
import work.devtools.modules.DEV.pojo.po.T_errorPK;

import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 错误信息Dao
 * @create: 2019-04-15
 **/
@Repository
public interface T_errorDao extends JpaRepository<T_error, T_errorPK> {

    @Query(value = "select error03 from t_error where error01 = ?1 and error02 = ?2" ,nativeQuery=true)
    String queryErrorMessage(String error01,String error02);

    @Query(value = "select error01,error03 from t_error where error01 in ?1 and error02 = ?2" ,nativeQuery=true)
    List<Map<String,String>> listErrorMessage(List<String> error01s, String error02);

}
