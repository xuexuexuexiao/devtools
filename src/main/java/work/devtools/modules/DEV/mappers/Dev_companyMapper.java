package work.devtools.modules.DEV.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.po.T_company;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: company及其Dto互转
 * @create: 2019-03-29
 **/
@Mapper
public interface Dev_companyMapper {

    Dev_companyMapper INSTANCE = Mappers.getMapper(Dev_companyMapper.class);

    Dev_company t_companyToDev_company(T_company t_company);

    T_company dev_companyToT_company(Dev_company dev_company);

}
