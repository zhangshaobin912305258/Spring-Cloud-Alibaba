package com.zhang.spring.cloud.dubbo.sample.provider;

import com.zhang.cloud.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * 类描述：
 * 创建时间：2020/6/22 12:51 上午
 * 创建人：zhang
 */

/**
 *
 */
@Service(cluster = "failfast")
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.format("[%s]: hello, %s", serviceName, name);
    }
}
