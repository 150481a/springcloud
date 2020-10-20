package com.xiaojun.myrule;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AdminXiang
 * @title: MyRule
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1610:48
 * `
 */
@Configuration
public class MyZoneAvoidanceRule {
    @Bean
    public IRule myRule(){
        return new ZoneAvoidanceRule();//选择一个最小的并发请求的server
    }

}
