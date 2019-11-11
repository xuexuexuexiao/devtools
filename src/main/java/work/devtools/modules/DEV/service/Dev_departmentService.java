package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_department;
import work.devtools.modules.DEV.pojo.po.T_department;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 部门service
 * @create: 2019-03-31
 **/
public interface Dev_departmentService {
    /**
     * 列表分页查询
     * @param pageable
     * @param dev_department
     * @return
     */
    Page<Dev_department> dynamicPageQuery(Pageable pageable, Dev_department dev_department);

    /**
     * 保存或者更新
     * @param dev_department
     * @return
     */
    Dev_department save(Dev_department dev_department);

    /**
     * 根据部门编号查找部门
     * @param department01
     * @return
     */
    T_department findByDepartment01(String department01);

    /**
     * 删除部门
     * @param department01
     * @return
     */
    void delete(String department01);
}
