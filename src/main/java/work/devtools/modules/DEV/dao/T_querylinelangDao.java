package work.devtools.modules.DEV.dao;
import work.devtools.modules.DEV.pojo.po.T_querylinelang;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_querylinelangPK;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_querylinelangDao extends JpaRepository<T_querylinelang, T_querylinelangPK> {

}
