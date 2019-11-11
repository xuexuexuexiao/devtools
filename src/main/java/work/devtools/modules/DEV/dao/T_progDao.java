package work.devtools.modules.DEV.dao;
import work.devtools.modules.DEV.pojo.po.T_prog;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_progDao extends JpaRepository<T_prog,String> {

}
