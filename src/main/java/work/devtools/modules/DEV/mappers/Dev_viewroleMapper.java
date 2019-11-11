package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_viewrole;
import work.devtools.modules.DEV.pojo.po.T_viewrole;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色界面Po转Dto
 * @create: 2019-04-02
 **/
@Mapper
public interface Dev_viewroleMapper {

    Dev_viewroleMapper INSTANCE = Mappers.getMapper(Dev_viewroleMapper.class );

    Dev_viewrole t_viewroleToDev_viewrole(T_viewrole t_viewrole);

    T_viewrole dev_viewroleToT_viewrole(Dev_viewrole dev_viewrole);
}
