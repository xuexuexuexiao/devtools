package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_query;
import work.devtools.modules.DEV.pojo.po.T_query;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-17
 **/
@Mapper
public interface Dev_queryMapper {

    Dev_queryMapper INSTANCE = Mappers.getMapper(Dev_queryMapper.class );

    Dev_query t_queryToDev_query(T_query t_query);

    T_query dev_queryToT_query(Dev_query dev_query);
}
