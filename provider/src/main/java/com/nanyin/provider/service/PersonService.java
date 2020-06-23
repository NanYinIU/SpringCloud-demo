package com.nanyin.provider.service;

import com.nanyin.provider.entity.Person;
import org.springframework.stereotype.Service;

/**
 * @author nanyin
 * @class PersonService.java
 * @description TODO
 * @create 15:00 2020-06-23
 */

public interface PersonService {
    Person findPersonByName(String name);
}
