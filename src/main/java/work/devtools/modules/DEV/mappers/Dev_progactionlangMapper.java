package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;
import work.devtools.modules.DEV.pojo.po.T_progactionlang;

import java.util.List;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Mapper
public interface Dev_progactionlangMapper {
	Dev_progactionlangMapper INSTANCE = Mappers.getMapper(Dev_progactionlangMapper.class);

	public T_progactionlang Dev_progactionlangToT_progactionlang(Dev_progactionlang vo);

	public Dev_progactionlang T_progactionlangToDev_progactionlang(T_progactionlang po);

	public List<T_progactionlang> Dev_progactionlangListToT_progactionlangList(List<Dev_progactionlang> vo);

}
