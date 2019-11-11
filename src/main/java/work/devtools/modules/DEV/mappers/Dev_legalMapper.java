package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.pojo.po.T_legal;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName
 * @desc: legal转legalDto
 * @create: 2019-03-28
 **/
@Mapper
public interface  Dev_legalMapper {

    Dev_legalMapper INSTANCE = Mappers.getMapper(Dev_legalMapper.class );

    Dev_legal t_legalToDev_legal(T_legal t_legal);

    T_legal dev_legalToT_Legal(Dev_legal dev_legal);
}
