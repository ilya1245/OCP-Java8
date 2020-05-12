package com.midway.ocp8.stream;

import com.midway.ocp8.model.Person;
import com.midway.ocp8.util.Utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        Map<Integer, List<Person>> personByAge = Utils.getPersonList().stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(personByAge);
        System.out.println("------------------------------------");

        Map<Integer, Long> numPersonByAge = Utils.getPersonList().stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println(numPersonByAge);
        System.out.println("------------------------------------");

        Map<Integer, List<String>> personNamesByAge = Utils.getPersonList().stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(personNamesByAge);
        System.out.println("------------------------------------");
    }
}
