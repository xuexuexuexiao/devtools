package work.devtools.modules.DEV.mappers;/**
 * Created by 20190301 on 2019/4/1.
 */

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import work.devtools.modules.DEV.pojo.dto.Dev_user;
import work.devtools.modules.DEV.pojo.po.T_user;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户po和Dto转换
 * @create: 2019-04-01
 **/
@Mapper
public interface Dev_userMapper {

    Dev_userMapper INSTANCE = Mappers.getMapper(Dev_userMapper.class );

    Dev_user t_userToDev_user(T_user t_user);

    T_user dev_userToT_user(Dev_user dev_user);
}
