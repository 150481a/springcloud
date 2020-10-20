package com.xiaojun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author AdminXiang
 * @title: PaymentFallbackService
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1910:39
 * `
 */
@Component
public class PaymentFallbackService  implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
