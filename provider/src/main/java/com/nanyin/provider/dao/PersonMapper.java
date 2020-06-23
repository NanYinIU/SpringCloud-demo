package com.nanyin.provider.dao;

import com.nanyin.provider.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nanyin
 * @class PersonMapper.java
 * @description TODO
 * @create 14:59 2020-06-23
 */
@Mapper
public interface PersonMapper {
    Person findPersonByName(String name);
}
