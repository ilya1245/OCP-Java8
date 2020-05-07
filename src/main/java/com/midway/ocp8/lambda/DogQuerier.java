package com.midway.ocp8.lambda;

import com.midway.ocp8.model.Dog;

@FunctionalInterface
public interface DogQuerier {

  boolean test(Dog d);

//  boolean test2(Dog d);

}
