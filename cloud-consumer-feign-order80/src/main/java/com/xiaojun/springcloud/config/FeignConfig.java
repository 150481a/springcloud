package com.xiaojun.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AdminXiang
 * @title: FeignConfig
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1615:22
 * `
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
