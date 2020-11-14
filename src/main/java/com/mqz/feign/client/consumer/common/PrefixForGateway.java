package com.mqz.feign.client.consumer.common;

/**
 * @author mqz
 * @description
 *
 *    定义供网关层区分的前缀，然后这个项目的web的url均要加上这个前缀
 *    现在ProviderController暂时没有加前缀，因为不想改调用放的代理接口，线上项目需要保证访问前缀统一
 *    这里可能有负载的情况，也就是说服务提供方有多个，需要保证服务提供方是一样的web的url
 *
 * @abount https://github.com/DemoMeng
 * @since 2020/11/14
 */
public class PrefixForGateway {


    public final static String prefix = "/feign-client-consumer/";


}
