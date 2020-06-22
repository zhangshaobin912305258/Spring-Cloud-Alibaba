package com.zhang.nacos.sample.provider;

import com.zhang.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 类描述：
 * 创建时间：2020/6/23 1:09 上午
 * 创建人：zhang
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello world:" + name;
    }
}
