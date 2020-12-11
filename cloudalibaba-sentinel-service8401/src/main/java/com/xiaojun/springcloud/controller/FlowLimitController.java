package com.xiaojun.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AdminXiang
 * @title: FlowLimitController
 * @projectName springcloud
 * @description: TODO
 * @date 2020/12/1018:11
 * `
 */
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }

}
