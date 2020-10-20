package com.xiaojun.springcloud;

import com.xiaojun.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author AdminXiang
 * @title: Order81MainApplication
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1610:31
 * `
 */
@EnableDiscoveryClient
@SpringBootApplication

public class Order81MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(Order81MainApplication.class,args);
    }
}
