package com.zhang.springcloud.dubbo.sample.consumer;

import com.zhang.cloud.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 * 创建时间：2020/6/22 1:13 上午
 * 创建人：zhang
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("zhang");
    }
}
