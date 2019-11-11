package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_department;
import work.devtools.modules.DEV.pojo.po.T_department;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 部门Po和Dto转换的接口
 * @create: 2019-03-31
 **/
@Mapper
public interface Dev_departmentMapper {

    Dev_departmentMapper INSTANCE = Mappers.getMapper(Dev_departmentMapper.class);

    Dev_department t_departmentToDev_department(T_department t_department);

    T_department dev_departmentToT_department(Dev_department dev_department);
}
