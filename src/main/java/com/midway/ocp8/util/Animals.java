package com.midway.ocp8.util;

import com.midway.ocp8.model.Dog;
import com.midway.ocp8.model.Duck;

import java.util.Arrays;
import java.util.List;

public class Animals {
    public static List<Dog> getDogList() {
        final Dog aiko = new Dog("aiko", 10, 10);
        final Dog boi = new Dog("boi", 6, 6);
        final Dog charis = new Dog("charis", 7, 7);
        final Dog clover = new Dog("clover", 12, 12);
        final Dog zooey = new Dog("zooey", 8, 8);
        final Dog aiko2 = new Dog("aiko", 11, 14);

        return Arrays.asList(boi, aiko, charis, clover, zooey, aiko2);
    }

    public static List<Duck> getDuckList() {
        return Arrays.asList(
                new Duck("Jerry", "yellow", 3),
                new Duck("George", "brown", 4),
                new Duck("Krammer", "mottled", 6),
                new Duck("Elaine", "white", 2),
                new Duck("Huey", "mottled", 2),
                new Duck("Louie", "white", 4),
                new Duck("Dwey", "brown", 6));
    }
}
