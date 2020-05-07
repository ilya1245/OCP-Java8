package com.midway.ocp8.lambda.functionalInterface.builtIn.predicate;

import com.midway.ocp8.model.Dog;
import java.util.function.Predicate;

public class PredicateSample {

  public static void main(String[] args) {
    Dog boi = new Dog("boi", 9, 30);
    Dog clover = new Dog("clover", 10, 25);
    Predicate<Dog> agePred = d -> d.getAge() > 9;

    System.out.println("Is Boi older than 9? " + agePred.test(boi));
    System.out.println("Is Clover older than 9? " + agePred.test(clover));
    System.out.println("--------------------------------------------");
    agePred = d -> d.getAge() == 10;
    System.out.println("Is Clover is 10? " + agePred.test(clover));
    System.out.println("Is Clover is not 10? " + agePred.negate().test(clover));
    System.out.println("--------------------------------------------");
    Predicate<Dog> weightPred_25 = dog -> dog.getWeight() == 25;
    Predicate<Dog> weightPred_23 = dog -> dog.getWeight() == 23;
    System.out.println("Is Clover is 10 and weight is 25? " + agePred.and(weightPred_25).test(clover));
    System.out.println("Is Clover is 10 or weight is 23? " + agePred.or(weightPred_23).test(clover));
    System.out.println("--------------------------------------------");
    System.out.println("Is Clover weight is 23 or Clover is 10? " + weightPred_23.or(agePred).test(clover));

  }

}
