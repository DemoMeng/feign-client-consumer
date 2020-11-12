package com.mqz.feign.client.consumer.web;

import com.mqz.feign.client.consumer.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return serverService.handle(userName);
    }

    @GetMapping("/su")
    public String su(String param){
        String json = "{'userName':'mqz','class':'1','type':'高级bug师','param':'"+param+"'}";
        return serverService.deal(json);
    }




}
