package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author AdminXiang
 * @title: Order81HystrixMainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1616:45
 * `
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class Order81HystrixMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Order81HystrixMainApplication.class,args);
    }
}
