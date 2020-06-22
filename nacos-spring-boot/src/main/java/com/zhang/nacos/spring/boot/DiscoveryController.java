package com.zhang.nacos.spring.boot;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类描述：
 * 创建时间：2020/6/22 11:55 下午
 * 创建人：zhang
 */
@RestController
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/discovery")
    public List<Instance> discovery(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
