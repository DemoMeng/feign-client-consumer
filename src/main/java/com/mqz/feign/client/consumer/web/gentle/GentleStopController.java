package com.mqz.feign.client.consumer.web.gentle;

import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 版权所有  copyright© 蒙大拿
 *
 * @author mqz
 * @date 2022/4/20
 * @about https://www.gitee.com/DemoMeng
 * @description eureka优雅停止服务
 */
@RestController
@RequestMapping(value = "/gentle")
public class GentleStopController {

    @Resource
    private EurekaAutoServiceRegistration eurekaAutoServiceRegistration;



    @GetMapping(value = "/stop")
    public void stop(){
        eurekaAutoServiceRegistration.stop();
    }

    @GetMapping(value = "/start")
    public void start(){
        eurekaAutoServiceRegistration.start();
    }



}
