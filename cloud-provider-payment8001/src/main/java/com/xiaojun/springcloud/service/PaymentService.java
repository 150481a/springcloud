package com.xiaojun.springcloud.service;

import com.xiaojun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author AdminXiang
 * @title: PaymentService
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1314:38
 * `
 */
public interface PaymentService {
    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
