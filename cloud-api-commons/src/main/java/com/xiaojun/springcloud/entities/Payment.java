package com.xiaojun.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author AdminXiang
 * @title: Payment
 * @projectName springcloud2020
 * @description: TODO
 * @date 2020/10/1314:35
 * `
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Integer id;
    private String serial;
}
