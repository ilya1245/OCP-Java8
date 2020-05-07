package com.midway.ocp8.stream;

import com.midway.ocp8.model.Dog;
import com.midway.ocp8.model.Duck;
import com.midway.ocp8.util.Animals;

import java.util.Comparator;
import java.util.List;

public class StreamSort {

    public static void main(String[] args) {
        List<Duck> duckList = Animals.getDuckList();
        duckList.stream()
                .sorted() //the objects must have "compare" method
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Sort by age
        duckList.stream()
                .sorted((d1, d2) -> d1.getAge() - d2.getAge()) //custom comparator
                .forEach(System.out::println);
        System.out.println("====================================");

        List<Dog> dogList = Animals.getDogList();
        // Sort names
        dogList.stream().map(d -> d.getName())
                .sorted()
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Sort by name
        Comparator<Dog> nameComparatorLambda = (d1, d2) -> d1.getName().compareToIgnoreCase(d2.getName());
        dogList.stream()
                .sorted(nameComparatorLambda) //custom comparator
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Sort by age
        Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);
        dogList.stream()
                .sorted(byAge) //custom comparator
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Sort by weight reversed
        Comparator<Dog> byWeight = Comparator.comparing(Dog::getWeight);
        dogList.stream()
                .sorted(byWeight.reversed()) //custom comparator
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        // Sort by name reversed and then by weight
        dogList.stream()
                .sorted(nameComparatorLambda.reversed().thenComparing(byWeight)) //custom comparator
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        //See unique names - aiko should be only once. order desc
        dogList.stream()
                .map(Dog::getName)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
