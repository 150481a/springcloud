package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author AdminXiang
 * @title: Payment8004Application
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1514:33
 * `
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Application.class,args);
    }
}
