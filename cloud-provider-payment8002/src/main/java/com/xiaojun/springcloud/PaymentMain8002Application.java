package com.xiaojun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author AdminXiang
 * @title: SoaApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1323:18
 * `
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002Application {
    public static void main(String[] args) {
        // 启动xy-soa
        SpringApplication.run(PaymentMain8002Application.class, args);

    }
}
