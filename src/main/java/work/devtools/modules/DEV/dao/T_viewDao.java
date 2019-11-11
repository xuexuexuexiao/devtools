package work.devtools.modules.DEV.dao;
import work.devtools.modules.DEV.pojo.po.T_view;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_viewDao extends JpaRepository<T_view,String> {

}
