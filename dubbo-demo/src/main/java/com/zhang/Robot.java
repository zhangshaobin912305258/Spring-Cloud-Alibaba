package com.zhang;

import org.apache.dubbo.common.extension.SPI;

/**
 * 类描述：
 * 创建时间：2020/6/22 10:41 上午
 * 创建人：zhang
 */
@SPI
public interface Robot {
    void sayHello();
}
