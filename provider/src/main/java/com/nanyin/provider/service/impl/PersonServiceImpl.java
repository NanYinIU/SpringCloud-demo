package com.nanyin.provider.service.impl;

import com.nanyin.provider.dao.PersonMapper;
import com.nanyin.provider.entity.Person;
import com.nanyin.provider.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nanyin
 * @class PersonServiceImpl.java
 * @description TODO
 * @create 15:00 2020-06-23
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Override
    public Person findPersonByName(String name) {
        name = name.trim();
        return personMapper.findPersonByName(name);
    }
}
