package com.nanyin.customer.controller;

import com.nanyin.customer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanyin
 * @class DefaultController.java
 * @description TODO
 * @create 17:56 2020-06-25
 */
@RestController
public class DefaultController {

    @Autowired
    DemoService demoService;

    @GetMapping("/echo/{name}")
    public String echoPerson(@PathVariable String name){
        return demoService.echoPerson(name);
    }
}

