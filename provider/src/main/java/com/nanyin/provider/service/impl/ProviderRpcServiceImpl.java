package com.nanyin.provider.service.impl;

import com.nanyin.api.service.OpenService;
import com.nanyin.provider.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nanyin
 * @class ProviderRpcServiceImpl.java
 * @description TODO
 * @create 20:35 2020-06-25
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version = "${provider.service.version}")
public class ProviderRpcServiceImpl implements OpenService {

    @Autowired
    PersonService personService;

    @Override
    public String getPersonInfo(String name) {
        return personService.findPersonByName(name).toString();
    }
}
