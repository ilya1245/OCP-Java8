package com.midway.ocp8.lambda;

import com.midway.ocp8.model.Dog;

public class PassLambdaToMethods {

  public static void main(String[] args) {
    Dog boi = new Dog("Boi", 8, 30);

    DogsPlay dogsPlay = new DogsPlay(d -> d.getAge() > 9);
    System.out.println("dogsPlay = " + dogsPlay.doQuery(boi));
  }

}
