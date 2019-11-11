package work.devtools.modules.DEV.mappers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_prog;
import work.devtools.modules.DEV.pojo.po.T_prog;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Mapper
public interface Dev_progMapper {
	Dev_progMapper INSTANCE = Mappers.getMapper(Dev_progMapper.class);

	public T_prog Dev_progToT_prog(Dev_prog vo);

	public Dev_prog T_progToDev_prog(T_prog po);

}
