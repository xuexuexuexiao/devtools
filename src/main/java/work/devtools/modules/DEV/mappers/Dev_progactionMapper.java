package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_progaction;
import work.devtools.modules.DEV.pojo.po.T_progaction;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Mapper
public interface Dev_progactionMapper {
	Dev_progactionMapper INSTANCE = Mappers.getMapper(Dev_progactionMapper.class);

	public T_progaction Dev_progactionToT_progaction(Dev_progaction vo);

	public Dev_progaction T_progactionToDev_progaction(T_progaction po);

}
