package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import work.devtools.modules.DEV.pojo.dto.Dev_employee;
import work.devtools.modules.DEV.pojo.po.T_employee;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: employee员工service接口
 * @create: 2019-03-31
 **/
public interface Dev_employeeService {
    /**
     * 保存或者更新
     * @param dev_employee
     * @return
     */
    Dev_employee save(Dev_employee dev_employee);

    /**
     * 根据员工编号查询员工
     * @param employee01
     * @return
     */
    T_employee findByEmployee01(String employee01);

    /**
     * 根据 编号删除员工
     * @param employee01
     */
    void delete(String employee01);

    /**
     * 分页查询
     * @param pageRequest
     * @param dev_employee
     * @return
     */
    Page<Dev_employee> dynamicPageQuery(PageRequest pageRequest, Dev_employee dev_employee);
}
