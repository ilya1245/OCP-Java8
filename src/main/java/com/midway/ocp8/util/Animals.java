package com.midway.ocp8.util;

import com.midway.ocp8.model.Dog;

import java.util.Arrays;
import java.util.List;

public class Animals {
    public static List<Dog> getDogList() {
        final Dog aiko = new Dog("aiko", 10, 10);
        final Dog boi = new Dog("boi", 6, 6);
        final Dog charis = new Dog("charis", 7, 7);
        final Dog clover = new Dog("clover", 12, 12);
        final Dog zooey = new Dog("zooey", 8, 8);

        return Arrays.asList(aiko, boi, charis, clover, zooey);
    }
}
