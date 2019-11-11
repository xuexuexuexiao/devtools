package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_employee;
import work.devtools.modules.DEV.pojo.po.T_employee;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 员工Po和Dto转换类接口
 * @create: 2019-03-31
 **/
@Mapper
public interface Dev_employeeMapper {

    Dev_employeeMapper INSTANCE = Mappers.getMapper(Dev_employeeMapper.class);

    Dev_employee t_employeeToDev_employee(T_employee t_employee);

    T_employee dev_employeeToT_employee(Dev_employee dev_employee);
}
