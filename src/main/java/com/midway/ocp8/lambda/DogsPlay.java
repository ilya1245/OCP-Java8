package com.midway.ocp8.lambda;

import com.midway.ocp8.model.Dog;

class DogsPlay {

  private DogQuerier dogQuerier;

  DogsPlay(DogQuerier dogQuerier) {
    this.dogQuerier = dogQuerier;
  }

  boolean doQuery(Dog d) {
    return dogQuerier.test(d);
  }
}
