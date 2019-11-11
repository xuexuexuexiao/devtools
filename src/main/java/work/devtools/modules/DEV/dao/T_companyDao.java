package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_company;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 公司Dao
 * @create: 2019-03-29
 **/
@Repository
public interface T_companyDao extends JpaRepository<T_company,String>{
    T_company findByCompany01(String company01);
}
