//Inspired by https://tproger.ru/articles/chto-nuzhno-znat-o-java-stream-api/

package com.midway.learnStream;

import com.midway.learnStream.dto.Passenger;
import com.midway.learnStream.util.DataProvider;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    private static List<Passenger> passengerList = DataProvider.getPassengers();

    public static void main(String[] args) {
        System.out.println("\n----- Call applyFilterByAge -----");
        applyFilterByAge();

        System.out.println("\n----- Call applyFilterByAgeWithDecimalPart -----");
        applyFilterByAgeWithDecimalPart();

        System.out.println("\n----- Call applyFilterByName -----");
        applyFilterByName();

        System.out.println("\n----- Call applyFilterByNameAndSplitBySpace -----");
        applyFilterByNameAndSplitBySpace();

    }

    // Age > 70
    private static void applyFilterByAge() {
        Stream<Passenger> filteredStream = passengerList.stream()
                .filter(p -> p.getAge() > 70);
        filteredStream.forEach(System.out::println);
    }

    // Age has decimal part
    private static void applyFilterByAgeWithDecimalPart() {
        passengerList.stream()
                .filter(p -> p.getAge() - (int) p.getAge() > 0)
                .forEach(System.out::println);
    }

    // Name contains "Thomas"
    private static void applyFilterByName() {
        passengerList.stream()
                .map(Passenger::getName)
                .filter(s -> s.contains("Thomas"))
                .limit(5) // quantity limit
                .sorted()
                .skip(3) //skip 3 first items
                .forEach(System.out::println);
    }

    // Name contains "Thomas", split by space
    private static void applyFilterByNameAndSplitBySpace() {
        passengerList.stream()
                .map(Passenger::getName)
                .filter(s -> s.contains("Thomas"))
                .filter(s -> s.contains("William"))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s += " - split")
                .forEach(System.out::println)
        ;
    }
}
