package com.zhang;

import com.zhang.user.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:META-INF/spring/order-consumer.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getNameById("123"));
    }
}
