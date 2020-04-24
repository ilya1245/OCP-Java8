package com.midway.ocp8.lambda.functionalInterface.builtIn.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {

  public static void main(String[] args) {
    UnaryOperator<Double> log2 = v -> Math.log(v) / Math.log(2);
    System.out.println("log2 = " + log2.apply(8.0));
  }

}
