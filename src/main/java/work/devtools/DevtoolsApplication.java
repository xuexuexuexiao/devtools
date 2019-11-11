package work.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableCaching       // 启用 Spring Cache 缓存功能
@EnableJpaAuditing   // 启用 Spring Data Jpa 审计
public class DevtoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsApplication.class, args);

    }

}
