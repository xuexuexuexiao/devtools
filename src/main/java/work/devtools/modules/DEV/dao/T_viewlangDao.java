package work.devtools.modules.DEV.dao;
import work.devtools.modules.DEV.pojo.po.T_viewlang;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.po.T_viewlangPK;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_viewlangDao extends JpaRepository<T_viewlang, T_viewlangPK> {

}
