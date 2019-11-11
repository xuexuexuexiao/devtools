package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.dao.T_employeeDao;
import work.devtools.modules.DEV.mappers.Dev_employeeMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_employee;
import work.devtools.modules.DEV.pojo.po.T_employee;
import work.devtools.modules.DEV.service.Dev_employeeService;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 员工ServiceImpl
 * @create: 2019-03-31
 **/
@Service
public class Dev_employeeServiceImpl implements Dev_employeeService{

    @Autowired
    private T_employeeDao t_employeeDao;

    @Override
    public Dev_employee save(Dev_employee dev_employee) {
        T_employee t_employee = t_employeeDao.saveAndFlush(Dev_employeeMapper.INSTANCE.dev_employeeToT_employee(dev_employee));
        return Dev_employeeMapper.INSTANCE.t_employeeToDev_employee(t_employee);
    }

    @Override
    public T_employee findByEmployee01(String employee01) {
        T_employee t_employee = t_employeeDao.findByEmployee01(employee01);
        return t_employee;
    }

    @Override
    public void delete(String employee01) {
        t_employeeDao.deleteById(employee01);
    }

    @Override
    public Page<Dev_employee> dynamicPageQuery(PageRequest pageRequest, Dev_employee dev_employee) {
        return null;
    }
}
