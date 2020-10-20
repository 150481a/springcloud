package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AdminXiang
 * @title: OderMainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1323:40
 * `
 */
@EnableEurekaClient
@SpringBootApplication
public class OderMain80Application {
    public static void main(String[] args) {
        SpringApplication.run(OderMain80Application.class,args);
    }
}
