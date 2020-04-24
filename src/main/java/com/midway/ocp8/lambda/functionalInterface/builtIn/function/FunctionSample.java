package com.midway.ocp8.lambda.functionalInterface.builtIn.function;

import java.util.function.Function;

public class FunctionSample {

  public static void main(String[] args) {
    Function<Integer, String> answer = a -> {
      if (a == 42) {
        return "forty-two";
      } else {
        return "No answer for you!";
      }
    };
    System.out.println(answer.apply(42));
    System.out.println(answer.apply(64));
  }
}
