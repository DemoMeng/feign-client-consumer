package com.mqz.feign.client.consumer.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/12/18
 */

@RefreshScope //实现刷新配置
@RestController
@RequestMapping("/feign/client/config")
public class ConfigController {


    @Value("${mqz.config.username}")
    private String username;
    @Value("${mqz.config.password}")
    private String password;

    @Value("${consumer.server.welcome}")
    private String mqz;

    @Value("${mqz}")
    private String mqz1;

    @GetMapping("/get")
    public String get(){
        //return "配置中心读取出来的配置是：username:"+ username+",password:"+password;
        return "配置中心读取出来的配置是：mqz:"+ mqz1;
    }

}
