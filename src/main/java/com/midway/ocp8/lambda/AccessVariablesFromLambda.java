package com.midway.ocp8.lambda;

import com.midway.ocp8.lambda.model.Dog;

public class AccessVariablesFromLambda {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);

    int numCats = 3;
//        int numBalls = 1; //now we have numBalls in enclosing scope

    DogQuerier dqWithCats = d -> {
      int numBalls = 1; //completely new variable local to lambda
      numBalls++;      //can modify numBalls
      System.out.println("numBalls = " + numBalls); //can access numBalls
      System.out.println("numCats = " + numCats);   //can access numCats
      return d.getAge() > 9;
    };
    System.out.println("dqWithCats = " + dqWithCats.test(boi));
  }

}
