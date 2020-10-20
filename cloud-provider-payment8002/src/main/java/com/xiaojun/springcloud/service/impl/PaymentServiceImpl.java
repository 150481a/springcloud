package com.xiaojun.springcloud.service.impl;

import com.xiaojun.springcloud.dao.PaymentMapper;
import com.xiaojun.springcloud.entities.Payment;
import com.xiaojun.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author AdminXiang
 * @title: PaymentServiceImpl
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1314:39
 * `
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
