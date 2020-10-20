package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AdminXiang
 * @title: Gateway9527MainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/2011:36
 * `
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527MainApplication.class,args);
    }
}
