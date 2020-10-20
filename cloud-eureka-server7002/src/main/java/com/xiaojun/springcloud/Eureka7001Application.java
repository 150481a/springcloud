package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AdminXiang
 * @title: Eureka7001Application
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/159:18
 * `
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Application.class,args);
    }
}
