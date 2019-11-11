package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_legal;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName
 * @desc: legalDao
 * @create: 2019-03-28
 **/
@Repository
public interface T_legalDao  extends JpaRepository<T_legal, String>  {

}
