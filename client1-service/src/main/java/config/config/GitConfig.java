package config.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName GitConfig
 * @Description
 * @Author wqz
 * @Date 2020-03-25
 */
@Component
@Data
public class GitConfig {
    @Value("${data.env}")
    private String env;
    @Value("${data.user.username}")
    private String userName;
    @Value("${data.user.password}")
    private String password;
}
