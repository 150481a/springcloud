package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author AdminXiang
 * @title: Eureka7002Application
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1510:53
 * `
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class,args);
    }
}
