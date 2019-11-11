package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_group;
import work.devtools.modules.DEV.pojo.po.T_group;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 组织Po和Dto转换的接口
 * @create: 2019-03-31
 **/
@Mapper
public interface Dev_groupMapper {

    Dev_groupMapper  INSTANCE = Mappers.getMapper(Dev_groupMapper.class);

    Dev_group t_groupToDev_group(T_group t_group);

    T_group dev_groupToT_group(Dev_group dev_group);
}
