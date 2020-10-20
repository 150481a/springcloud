package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author AdminXiang
 * @title: Payment8006MainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1610:22
 * `
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8006MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006MainApplication.class,args);
    }
}
