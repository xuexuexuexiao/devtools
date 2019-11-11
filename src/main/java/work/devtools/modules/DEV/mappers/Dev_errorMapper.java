package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_error;
import work.devtools.modules.DEV.pojo.po.T_error;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
@Mapper
public interface Dev_errorMapper {

    Dev_errorMapper INSTANCE = Mappers.getMapper(Dev_errorMapper.class);

    Dev_error t_errorToDev_error(T_error t_error);

    T_error dev_errorToT_error(Dev_error dev_error);
}
