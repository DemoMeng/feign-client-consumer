package com.mqz.feign.client.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

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

    /**
     * 针对读取配置中心的属性时候
     * 当在第一个application.yml下找不到的时候，它就会报错。
     * 添加之后会忽略暂时在该配置文件里未取到的value，继续寻找下去，该问题就解决了。
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
        c.setIgnoreUnresolvablePlaceholders(true);
        return c;
    }


}
