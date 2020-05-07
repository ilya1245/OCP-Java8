package com.midway.ocp8.lambda.functionalInterface.builtIn.consumer;

import com.midway.ocp8.model.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachAndThenSample {

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    Dog boi = new Dog("boi", 30, 6);
    Dog clover = new Dog("clover", 32, 8);
    Dog zooey = new Dog("zooey", 31, 7);
    dogs.add(boi);
    dogs.add(clover);
    dogs.add(zooey);
    Consumer<Dog> displayname = d -> System.out.println(d.getName() + "  ");
    dogs.forEach(displayname);
    System.out.println("--------------------------------------------");
    dogs.forEach(displayname.andThen(d -> d.bark()).andThen(d -> d.growl()));
    System.out.println("--------------------------------------------");
    dogs.removeIf(d -> d.getName().startsWith("c"));
    dogs.forEach(displayname);
  }

}
