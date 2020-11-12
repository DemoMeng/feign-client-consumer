package com.mqz.feign.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mqz
 *
 * @EnableFeignClient 开启feign客户端（服务消费方） ，服务提供方不需要配置任何feign的配置
 * @EnableEurekaClient 开启eureka服务客户端（服务端是Eureka server）
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mqz.feign.client.consumer.**"})
@EnableFeignClients
@EnableEurekaClient
public class FeignClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientConsumerApplication.class, args);
    }

}
