package com.zhang.spring.cloud.dubbo.sample.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan
public class SpringCloudDubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleProviderApplication.class, args);
    }

}
