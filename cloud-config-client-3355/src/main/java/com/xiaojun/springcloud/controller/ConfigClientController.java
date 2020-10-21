package com.xiaojun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AdminXiang
 * @title: ConfigClientController
 * @projectName springcloud
 * @description: TODO
 * @date 2020/10/2123:24
 * `
 */
@RestController
@Slf4j
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/serverPort")
    public String getServerPort(){
        return serverPort;
    }

}
