package com.zhang.nacos.sample.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
public class NacosSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSampleProviderApplication.class, args);
    }

}
