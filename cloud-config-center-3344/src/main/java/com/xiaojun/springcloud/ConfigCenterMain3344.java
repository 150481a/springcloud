package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AdminXiang
 * @title: ConfigCenterMain3344
 * @projectName springcloud
 * @description: TODO
 * @date 2020/10/2023:36
 * `
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
