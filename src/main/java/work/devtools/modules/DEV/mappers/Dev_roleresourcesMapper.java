package work.devtools.modules.DEV.mappers;/**
 * Created by 20190301 on 2019/4/2.
 */

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_roleresources;
import work.devtools.modules.DEV.pojo.po.T_roleresources;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 角色资源po和Dto互转
 * @create: 2019-04-02
 **/
@Mapper
public interface Dev_roleresourcesMapper {

    Dev_roleresourcesMapper INSTANCE = Mappers.getMapper(Dev_roleresourcesMapper.class );

    Dev_roleresources t_roleresourcesToDev_roleresources(T_roleresources t_roleresources);

    T_roleresources dev_roleresourcesToT_roleresources(Dev_roleresources dev_roleresources);
}
