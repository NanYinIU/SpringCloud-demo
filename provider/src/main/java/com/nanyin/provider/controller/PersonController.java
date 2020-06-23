package com.nanyin.provider.controller;

import com.nanyin.provider.entity.Person;
import com.nanyin.provider.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanyin
 * @class PersonController.java
 * @description TODO
 * @create 15:00 2020-06-23
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/person/{name}")
    public String personMes(@PathVariable String name){
        Person personByName = personService.findPersonByName(name);
        return personByName.toString();
    }
}
