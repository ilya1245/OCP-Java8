package com.midway.ocp8.stream;

import com.midway.ocp8.model.Dog;
import com.midway.ocp8.util.Utils;

import java.util.List;

public class StreamMatch {

    public static void main(String[] args) {
        List<Dog> dogs = Utils.getDogList();
        boolean cNames = dogs.stream().filter(d -> d.getWeight() > 11)
                .anyMatch(d -> d.getName().startsWith("c"));
        System.out.println("Are there any dogs > 11 pounds whose name starts with 'c'? " + cNames);
        System.out.println("------------------------------------");

        boolean isOlder = dogs.stream() //
                .mapToInt(d -> d.getAge()) // map from Dog to the Dog's age (integer)
                .allMatch(a -> a > 5); // do all dogs have an age > 5?
//                .allMatch(d -> d.getAge() > 5); //works as well
        System.out.println("Are all the dogs age older than 5? " + isOlder);
        System.out.println("------------------------------------");

        boolean notRed = dogs.stream() //
                .map(Dog::getName) // map from Dog to Dog's name (String)
                .noneMatch(n -> n.equals("red")); // are any of the dogs named "red"?
        System.out.println("None of the dogs are red: " + notRed);
    }
}
