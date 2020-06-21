package com.zhang.springboot.consumer;

import com.zhang.sample.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
    }

    @Reference//(url = "dubbo://192.168.0.100:20880/com.zhang.sample.HelloService")
    private HelloService helloService;

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("zhang"));
    }

}
