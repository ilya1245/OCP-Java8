package com.midway.ocp8.lambda.functionalInterface.builtIn.consumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class ConsumerSample2 {

  public static void main(String[] args) {
    Map<String, String> env = System.getenv();
    BiConsumer<String, String> printEnv = (key, value) -> {
      System.out.println(key + ": " + value);
    };

    printEnv.accept("USER", env.get("USER"));
  }

}
