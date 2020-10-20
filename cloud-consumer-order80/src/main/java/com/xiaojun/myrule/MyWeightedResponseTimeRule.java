package com.xiaojun.myrule;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
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
public class MyWeightedResponseTimeRule {
    @Bean
    public IRule myRule(){
        return new WeightedResponseTimeRule();//根据响应时间分配一个weight，响应时间越长，weight越小，被选中的可能性越低。
    }

}
