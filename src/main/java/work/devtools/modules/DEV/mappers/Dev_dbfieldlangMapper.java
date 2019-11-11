package work.devtools.modules.DEV.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_dbfieldlang;
import work.devtools.modules.DEV.pojo.po.T_dbfieldlang;


@Mapper
public interface Dev_dbfieldlangMapper {
	
	Dev_dbfieldlangMapper INSTANCE = Mappers.getMapper(Dev_dbfieldlangMapper.class);
	
	
	public T_dbfieldlang Dev_dbfieldlangToT_dbfieldlang(Dev_dbfieldlang vo);
					
	

}
