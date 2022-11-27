package com.midway.learnStream;

import com.midway.learnStream.dto.Passenger;
import com.midway.learnStream.util.DataProvider;

import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
       applyFilterAndPrint();
        System.out.println();
        applyFilterAndPrint_1();

    }

    private static void applyFilterAndPrint() {
        Stream<Passenger> filteredStream = DataProvider.getPassengers().stream()
                .filter(p -> p.getAge() > 70);

        filteredStream.forEach(System.out::println);
    }

    private static void applyFilterAndPrint_1() {
        Stream<Passenger> filteredStream = DataProvider.getPassengers().stream()
                .filter(p -> p.getAge() - (int)p.getAge() > 0);

        filteredStream.forEach(System.out::println);
    }
}
