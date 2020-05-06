package com.midway.ocp8.optional;

import br.fernando.ch09_Streams_Objective.par06_Optionals.Test04;
import com.midway.ocp8.lambda.model.Dog;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    static final List<Dog> dogsList = Arrays.asList(new Dog("Boi", 5), new Dog("Bingo", 5));

    public static void main(String[] args) {
        // Create Optional from an object
        Dog boi = new Dog("boi", 6);
        Optional<Dog> optionalDog = Optional.of(boi);
        optionalDog.ifPresent(System.out::println);
        System.out.println("------------------------------------");

        // Create empty Optional
        optionalDog = Optional.empty();
        if (!optionalDog.isPresent()) {
            System.out.println("Optional must be null!");
        }
        System.out.println("------------------------------------");

        // Get object form Optional, use orElse to set default
        //optionalDog = Optional.ofNullable(boi);
        Dog aDog = optionalDog.orElse(dogsList.get(1));
        System.out.println(aDog);
        System.out.println("------------------------------------");

        boi = null;
//        optionalDog = Optional.of(boi); // potential problem here
        optionalDog = Optional.ofNullable(boi);
        optionalDog.ifPresent(System.out::println); //no problem but no output
        if (!optionalDog.isPresent()) {
            System.out.println("Boi is null!");
        }
        System.out.println("------------------------------------");

        // findFirst returns Optional of Dog
        optionalDog = dogsList.stream().findFirst();
        optionalDog.ifPresent(System.out::println);

    }
}
