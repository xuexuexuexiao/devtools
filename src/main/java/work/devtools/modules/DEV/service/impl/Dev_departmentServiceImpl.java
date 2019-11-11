package work.devtools.modules.DEV.service.impl;/**
 * Created by 20190301 on 2019/3/31.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.modules.DEV.dao.T_departmentDao;
import work.devtools.modules.DEV.mappers.Dev_departmentMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_department;
import work.devtools.modules.DEV.pojo.po.T_department;
import work.devtools.modules.DEV.service.Dev_departmentService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 部门ServiceImpl
 * @create: 2019-03-31
 **/
@Service
public class Dev_departmentServiceImpl implements Dev_departmentService {

    @Autowired
    private T_departmentDao t_departmentDao;

    @Override
    public Page<Dev_department> dynamicPageQuery(Pageable pageRequest, Dev_department dev_department) {
        return null;
    }

    @Override
    @Transactional
    public Dev_department save(Dev_department dev_department) {
        T_department t_department = t_departmentDao.saveAndFlush(Dev_departmentMapper.INSTANCE.dev_departmentToT_department(dev_department));
        return Dev_departmentMapper.INSTANCE.t_departmentToDev_department(t_department);
    }

    @Override
    public T_department findByDepartment01(String department01) {
        T_department t_department = t_departmentDao.findByDepartment01(department01);
        return t_department;
    }

    @Override
    @Transactional
    public void delete(String department01) {
        t_departmentDao.deleteById(department01);
    }
}
