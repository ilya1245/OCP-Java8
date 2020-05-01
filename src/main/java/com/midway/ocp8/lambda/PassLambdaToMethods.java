package com.midway.ocp8.lambda;

import com.midway.ocp8.lambda.model.Dog;

public class PassLambdaToMethods {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);

    DogsPlay dogsPlay = new DogsPlay(d -> d.getAge() > 9);
    System.out.println("dogsPlay = " + dogsPlay.doQuery(boi));
  }

}
