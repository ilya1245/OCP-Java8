package com.midway.ocp8.stream;

import com.midway.ocp8.model.Dog;
import com.midway.ocp8.util.Utils;

import java.util.List;
import java.util.Optional;

public class StreamFind {

    public static void main(String[] args) {
        List<Dog> dogs = Utils.getDogList();
        Optional<Dog> c50 = dogs.stream()
                .filter(d -> d.getName().startsWith("c")) //.peek(System.out::println)
                .filter(d -> d.getWeight() > 11)
                .findAny();
        c50.ifPresent(System.out::println);
        System.out.println("------------------------------------");

/*        List<Dog> dl = dogs.stream()
                .filter(d -> d.getName().startsWith("c")).peek(System.out::println)
                .collect(Collectors.toList());*/


    }
}
