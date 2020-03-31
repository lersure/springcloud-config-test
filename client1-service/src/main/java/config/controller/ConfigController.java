package config.controller;

import config.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description
 * @Author wqz
 * @Date 2020-03-25
 */
@RefreshScope
@RestController
public class ConfigController {
    @Autowired
    private GitConfig gitConfig;

    @GetMapping("/show")
    public Object selectConfig() {
        return gitConfig;
    }
}
