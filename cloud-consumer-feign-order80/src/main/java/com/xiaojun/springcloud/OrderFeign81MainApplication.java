package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author AdminXiang
 * @title: Order81MainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1614:35
 * `
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign81MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign81MainApplication.class,args);
    }
}
