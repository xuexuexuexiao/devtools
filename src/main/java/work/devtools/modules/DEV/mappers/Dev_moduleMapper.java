package work.devtools.modules.DEV.mappers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_module;
import work.devtools.modules.DEV.pojo.po.T_module;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Mapper
public interface Dev_moduleMapper {
    Dev_moduleMapper INSTANCE = Mappers.getMapper(Dev_moduleMapper.class);

    public T_module Dev_moduleToT_module(Dev_module vo);

}
