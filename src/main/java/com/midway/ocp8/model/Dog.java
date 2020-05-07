package com.midway.ocp8.model;

import lombok.Data;

@Data
public class Dog {

  private int age;
  private String name;
  private int weight;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Dog(String name, int age, int weight) {
    this.age = age;
    this.name = name;
    this.weight = weight;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public void growl() {
    System.out.println("R-r-r!");
  }
}
