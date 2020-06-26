package com.nanyin.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nanyin.api.service.OpenService;
import com.nanyin.customer.service.DemoService;
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
    OpenService openService;

    @Override
    public String echoPerson(String name) {
        return openService.getPersonInfo(name);
    }
}
