package com.mqz.feign.client.consumer.web;

import com.mqz.feign.client.consumer.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/11/11
 */
@RestController
@RequestMapping("/feign/client/consumer")
public class ClientConsumerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("/ok")
    public String ok(String userName){
        //线程安全list
        List<String> a = new CopyOnWriteArrayList<>();
        return serverService.handle(userName);
    }

    @GetMapping("/su")
    public String su(String param){
        String json = "{'userName':'mqz','class':'1','type':'高级bug师','param':'"+param+"'}";
        return serverService.deal(json);
    }

    @GetMapping("/userInfo")
    public String userInfo(){
        return "用户需要登录的接口";
    }





}
