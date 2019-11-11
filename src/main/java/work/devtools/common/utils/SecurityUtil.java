package work.devtools.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import work.devtools.modules.DEV.dao.T_userDao;
import work.devtools.modules.DEV.pojo.dto.Dev_user;
import work.devtools.modules.DEV.pojo.po.T_user;

import javax.annotation.PostConstruct;

/**
* @Description: 安全验证工具类
* @Author: CPQ
* @date: 2019/4/18 上午 9:53
* @Version: 1.0
*/
@Component
public class SecurityUtil {
    @Autowired
    private T_userDao t_userDao;

    private static SecurityUtil securityUtil;

    @PostConstruct
    public void init(){
        securityUtil = this;
    }
    /**
     * 获取登录用户
    */
    public static Dev_user getUser() {
        //TODO
        //security获取登录用户

        //测试用
        Dev_user dev_user = new Dev_user();
        dev_user.setUser01("001");
        dev_user.setUser02("001");
        dev_user.setUser03("001");
        dev_user.setUser11("");
        return dev_user;
    }

    /**
     *   获取用户国际化语言
     */
    public static String getLocale(){
        String locale = null;
        //session中获取用户国际化语言
        Dev_user dev_user = SecurityUtil.getUser();
        locale = dev_user.getUser11();
        //如果session中获取不到，则到数据库获取
        if(StringUtil.isEmpty(locale)){
            locale = securityUtil.t_userDao.queryLocale(dev_user.getUser01());
        }
        return locale;
    }
}
