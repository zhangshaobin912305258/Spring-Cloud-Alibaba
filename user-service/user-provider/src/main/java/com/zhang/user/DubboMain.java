package com.zhang.user;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 类描述：
 * 创建时间：2020/6/20 11:21 下午
 * 创建人：zhang
 */
public class DubboMain {

    public static void main(String[] args) throws IOException {
        //第一张方式
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/user-provider.xml");
        context.start();
        System.in.read(); //阻塞Main线程
        /**
         * 第二种方式
         */
        //Main.main(args);
    }
}
