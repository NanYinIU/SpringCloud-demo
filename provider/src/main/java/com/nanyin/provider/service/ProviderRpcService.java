package com.nanyin.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author nanyin
 * @class ProviderRpcService.java
 * @description TODO
 * @create 20:34 2020-06-25
 */
public interface ProviderRpcService {
    public String getPersonInfo(String name);
}
