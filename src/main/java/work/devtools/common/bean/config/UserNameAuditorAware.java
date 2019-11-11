package work.devtools.common.bean.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
* @Description:    审计Spring Data JPA通过AuditorAware<T>接口获取用户信息
* @Author:         CPQ
* @date:     2019/4/11 0011 下午 6:33
* @Version:        1.0
*/
@Component
public class UserNameAuditorAware implements AuditorAware<String> {

    @Value("testName")
    private String userName;

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(userName);
    }

}