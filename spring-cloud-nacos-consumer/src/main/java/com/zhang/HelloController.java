package com.zhang;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private IHelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.sayHello("zhang");
    }
}
