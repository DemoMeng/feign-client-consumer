package com.mqz.feign.client.consumer.service.sentinels;

import com.mqz.feign.client.consumer.service.ServerService;
import org.springframework.stereotype.Component;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2021/2/5
 */
@Component
public class ServerServiceFallback implements ServerService {
    @Override
    public String handle(String userName) {

        return null;
    }

    @Override
    public String deal(String json) {
        return null;
    }
}
