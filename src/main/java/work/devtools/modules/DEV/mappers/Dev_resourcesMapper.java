package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_resources;
import work.devtools.modules.DEV.pojo.po.T_resources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 资源po和Dto互转
 * @create: 2019-04-02
 **/
@Mapper
public interface Dev_resourcesMapper {

    Dev_resourcesMapper INSTANCE = Mappers.getMapper(Dev_resourcesMapper.class );

    Dev_resources t_resourcesToDev_resources(T_resources t_resources);

    T_resources dev_resourcesToT_resources(Dev_resources dev_resources);
}
