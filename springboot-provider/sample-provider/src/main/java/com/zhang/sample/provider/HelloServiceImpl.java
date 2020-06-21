package com.zhang.sample.provider;

import com.zhang.sample.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * 类描述：
 * 创建时间：2020/6/21 10:24 下午
 * 创建人：zhang
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello,%s", serviceName, name);
    }
}
