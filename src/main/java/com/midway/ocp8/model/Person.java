package com.midway.ocp8.model;

import lombok.Data;

@Data
public class Person {
    public final String name;
    public final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
