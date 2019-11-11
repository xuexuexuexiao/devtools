package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.common.domain.ui.ElementUIInput;
import work.devtools.modules.DEV.pojo.po.T_viewcontrol;
import work.devtools.modules.DEV.pojo.po.T_viewcontrolPK;

import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Repository
public interface T_viewcontrolDao extends JpaRepository<T_viewcontrol,T_viewcontrolPK>{
    List<ElementUIInput> findByViewcontrol01(String viewcontrol01);
}
