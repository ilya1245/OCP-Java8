package com.midway.ocp8.lambda.functionalInterface.builtIn.supplier;

import java.util.function.Supplier;

public class SupplierSample {

  public static void main(String[] args) {
    Supplier<Integer> answerSupplier = () -> 42;

    Supplier<Integer> answerSupplierOld = new Supplier<Integer>() {
      @Override
      public Integer get() {
        return 42;
      }
    };
    System.out.println("answerSupplier.get() = " + answerSupplier.get());
    System.out.println("answerSupplierOld.get() = " + answerSupplierOld.get());

  }

}
