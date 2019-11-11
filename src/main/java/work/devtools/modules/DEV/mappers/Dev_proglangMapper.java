package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_proglang;
import work.devtools.modules.DEV.pojo.po.T_proglang;

import java.util.List;

/**
 * Created on 2019/04/18.
 *
 * @author CPQ
 */
@Mapper
public interface Dev_proglangMapper {
	Dev_proglangMapper INSTANCE = Mappers.getMapper(Dev_proglangMapper.class);

	public T_proglang Dev_proglangToT_proglang(Dev_proglang vo);

	public Dev_proglang T_proglangToDev_proglang(T_proglang po);

	public List<T_proglang> Dev_proglangListToT_proglangList(List<Dev_proglang> vo);

}
