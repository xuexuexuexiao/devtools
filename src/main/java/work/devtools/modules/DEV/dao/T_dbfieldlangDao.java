package work.devtools.modules.DEV.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_dbfieldlang;
import work.devtools.modules.DEV.pojo.po.T_dbfieldlangPK;


/**
 * Created on 2019/04/11.
 *
 * @author XX
 */
@Repository
public interface T_dbfieldlangDao extends JpaRepository<T_dbfieldlang, T_dbfieldlangPK> {

}

