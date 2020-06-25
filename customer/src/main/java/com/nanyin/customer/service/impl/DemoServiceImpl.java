package com.nanyin.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nanyin.customer.service.DemoService;
import com.nanyin.provider.service.ProviderRpcService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author nanyin
 * @class DemoServiceImpl.java
 * @description TODO
 * @create 18:01 2020-06-25
 */
@Service
@org.springframework.stereotype.Service
public class DemoServiceImpl implements DemoService {

    @Reference(version = "${customer.service.version}")
    ProviderRpcService providerRpcService;

    @Override
    public String echoPerson(String name) {
        return providerRpcService.getPersonInfo(name);
    }
}
