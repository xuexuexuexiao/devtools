package work.devtools.modules.DEV.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import work.devtools.modules.DEV.pojo.po.T_department;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 部门资料Dao
 * @create: 2019-03-31
 **/
@Repository
public interface T_departmentDao extends JpaRepository<T_department,String>{
    T_department findByDepartment01(String department01);
}
