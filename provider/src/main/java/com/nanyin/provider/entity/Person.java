package com.nanyin.provider.entity;

/**
 * @author nanyin
 * @class Person.java
 * @description TODO
 * @create 14:58 2020-06-23
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", note='" + note + '\'' +
                '}';
    }
}
