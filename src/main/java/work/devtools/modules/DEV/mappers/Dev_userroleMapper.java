package work.devtools.modules.DEV.mappers;/**
 * Created by 20190301 on 2019/4/1.
 */

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_userrole;
import work.devtools.modules.DEV.pojo.po.T_userrole;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-01
 **/
@Mapper
public interface Dev_userroleMapper {

    Dev_userroleMapper INSTANCE = Mappers.getMapper(Dev_userroleMapper.class );

    Dev_userrole t_userToDev_user(T_userrole t_userrole);

    T_userrole dev_userToT_user(Dev_userrole dev_userrole);
}
