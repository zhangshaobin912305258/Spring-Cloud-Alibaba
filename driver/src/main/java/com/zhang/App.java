package com.zhang;

import com.zhang.spi.Driver;

import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        System.out.println(loader.iterator());
        loader.forEach(serviceLoader-> System.out.println(serviceLoader.connect()));
    }
}
