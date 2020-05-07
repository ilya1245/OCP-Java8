package com.midway.ocp8.model;

import lombok.Data;

@Data
public class Duck implements Comparable<Duck> {

    private final String name;
    private final String color;
    private final int age;

    public Duck(String name, String color, int age) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int compareTo(Duck otherDuck) {
        return this.getName().compareTo(otherDuck.getName());
    }
}
