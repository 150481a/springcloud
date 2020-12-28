package com.xiaojun.springcloud.alibaba.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.xiaojun.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
