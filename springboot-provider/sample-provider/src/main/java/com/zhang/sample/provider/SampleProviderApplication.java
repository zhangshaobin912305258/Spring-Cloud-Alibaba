package com.zhang.sample.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
public class SampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleProviderApplication.class, args);
    }

}
