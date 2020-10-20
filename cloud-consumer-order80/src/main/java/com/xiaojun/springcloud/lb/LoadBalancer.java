package com.xiaojun.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author AdminXiang
 * @title: LoadBalancer
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1611:53
 * `
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
