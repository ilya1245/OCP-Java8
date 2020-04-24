package com.midway.ocp8.lambda.functionalInterface.builtIn.supplier;

import java.util.Map;
import java.util.function.Supplier;

public class SupplierSample2 {

  public static void main(String[] args) {
    Supplier<String> userSupplier = () -> {
      Map<String, String> env = System.getenv();
      return env.get("USER");
    };
    System.out.println("User is  = " + userSupplier.get());

  }

}
