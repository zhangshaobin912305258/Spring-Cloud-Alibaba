package com.zhang.springcloud.dubbo.sample.consumer;

import com.zhang.cloud.HelloService;

/**
 * 类描述：
 * 创建时间：2020/6/22 1:50 上午
 * 创建人：zhang
 */
public class MockHelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "服务无法访问，请稍后再试";
    }
}
