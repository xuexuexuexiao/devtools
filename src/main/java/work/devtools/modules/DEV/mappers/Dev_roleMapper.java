package work.devtools.modules.DEV.mappers;/**
 * Created by 20190301 on 2019/4/1.
 */

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_role;
import work.devtools.modules.DEV.pojo.po.T_role;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色po和Dto的转换
 * @create: 2019-04-01
 **/
@Mapper
public interface Dev_roleMapper {
    Dev_roleMapper INSTANCE = Mappers.getMapper(Dev_roleMapper.class );

    Dev_role t_roleToDev_role(T_role t_role);

    T_role dev_roleToT_role(Dev_role dev_role);
}
