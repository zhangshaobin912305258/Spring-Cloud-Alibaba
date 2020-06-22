package com.zhang;


import java.util.ServiceLoader;

/**
 * 类描述：
 * 创建时间：2020/6/22 10:44 上午
 * 创建人：zhang
 */
public class JavaSPITest {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
