package com.xiaojun.springcloud.dao;

import com.xiaojun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author AdminXiang
 * @title: PaymentMapper
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1323:26
 * `
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
