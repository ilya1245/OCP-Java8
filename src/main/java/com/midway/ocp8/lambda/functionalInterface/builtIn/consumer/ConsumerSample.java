package com.midway.ocp8.lambda.functionalInterface.builtIn.consumer;

import java.util.function.Consumer;

public class ConsumerSample {

  public static void main(String[] args) {
    Consumer<String> redOrBlue = pill -> {
      if (pill.equals("red")) {
        System.out.println("Down the rabbit hole");
      } else if (pill.equals("blue")) {
        System.out.println("Stay in lalal land");
      }
    };
    redOrBlue.accept("red");
  }

}
