package com.mqz.feign.client.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/11/11
 *
 *   被调用的方法名和调用方的方法名可以不一样，但是请求url需要完全相同
 *
 */
//下面这个feign是直接调用的方式，也就是不把feign提供者和消费者注册到注册中心，直接指定ip调用，这样是没有Road Balance的（不需要如下Eureka的配置）
//@FeignClient(url="${feign.server.url}",value = "serverService")

//feign调用注册中心的feign服务提供者，这样能实现负载均衡的效果
@Component
@FeignClient(name="feign-server-provider")
public interface ServerService {

    /**
     * handle
     * @param userName
     * @return
     */
    @GetMapping(value = "/feign/service/provider/1")
    String handle(@RequestParam(required = false,value = "userName") String userName);

    /**
     * deal
     * @param json
     * @return
     */
    @PostMapping(value = "/feign/service/provider/2",consumes = "application/json")
    String deal(@RequestParam("json") String json);

}
