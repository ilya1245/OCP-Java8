package com.midway.ocp8.lambda;

import com.midway.ocp8.model.Dog;

import java.util.function.Predicate;

public class PredicateSample {

  public static void main(String[] args) {
    Dog boi = new Dog("boi", 9, 30);
    Dog clover = new Dog("clover", 10, 25);
    Predicate<Dog> p = d -> d.getAge() > 9;
    Predicate<Dog> p2 = d -> d.getAge() < 4;

    System.out.println("Is Boi older than 9 - " + p.test(boi));
    System.out.println("Is Clover older than 9 - " + p.test(clover));
  }

}
