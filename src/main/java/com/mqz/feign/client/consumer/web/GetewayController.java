package com.mqz.feign.client.consumer.web;

import com.mqz.feign.client.consumer.common.PrefixForGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/11/11
 */
@RestController
@RequestMapping(value = PrefixForGateway.prefix+"/gateway")
public class GetewayController {


    @GetMapping(value = "/1")
    public String handle(String userName){
        //TODO 模拟具体业务层调用
        return "【feign-client 网关转过来的调用 ：】"+userName+": 成功";
    }

    @PostMapping(value = "/2")
    public String deal1(String json){
        return "【feign-client  网关转过来的调用 ：】传递的JSON为："+json;
    }


}
