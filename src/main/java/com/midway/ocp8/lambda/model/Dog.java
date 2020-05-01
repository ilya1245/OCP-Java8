package com.midway.ocp8.lambda.model;

import lombok.Data;

@Data
public class Dog {

  private int age;
  private String name;
  private int weight;

  public Dog(int age, String name, int weight) {
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
