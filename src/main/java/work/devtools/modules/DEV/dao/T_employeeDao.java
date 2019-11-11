package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_employee;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 员工资料Dao
 * @create: 2019-03-31
 **/
@Repository
public interface T_employeeDao extends JpaRepository<T_employee,String>{
    T_employee findByEmployee01(String employee01);
}
