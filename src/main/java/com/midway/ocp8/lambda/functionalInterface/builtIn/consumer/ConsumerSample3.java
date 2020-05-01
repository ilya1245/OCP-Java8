package com.midway.ocp8.lambda.functionalInterface.builtIn.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample3 {

  public static void main(String[] args) {
    List<String> dogNames = Arrays.asList("boi", "clover", "zooey");
    Consumer<String> printName = name -> System.out.println(name);
    dogNames.forEach(printName);
    dogNames.forEach(n -> System.out.println(n));
  }
}
