package com.xiaojun.springcloud.controller;

import com.xiaojun.springcloud.entities.CommonResult;
import com.xiaojun.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author AdminXiang
 * @title: OrderController
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1610:33
 * `
 */
@RestController
@Slf4j

public class OrderController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
        return result;
    }

}
