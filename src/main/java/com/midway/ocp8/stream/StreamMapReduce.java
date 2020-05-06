package com.midway.ocp8.stream;

import br.fernando.ch09_Streams_Objective.par05_map_filter_Reduce_with_average_and_Optionals.Test03;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamMapReduce {
    static final List<Reading> readings = Arrays.asList(
            new Reading(2017, 1, 1, 405.91),
            new Reading(2017, 1, 8, 405.98),
            new Reading(2017, 1, 15, 406.14),
            new Reading(2017, 1, 22, 406.48),
            new Reading(2017, 1, 29, 406.20),
            new Reading(2017, 2, 5, 407.12),
            new Reading(2017, 2, 12, 406.03)
    );

    public static void main(String[] args) {
        OptionalDouble avg = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 406d && v < 407d).average();
        System.out.println("Average is " + (avg.isPresent() ? avg.getAsDouble() : "empty"));
        System.out.println("------------------------------------");

        avg = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 106d && v < 107d).average();
        System.out.println("Average is " + (avg.isPresent() ? avg.getAsDouble() : "empty"));
        System.out.println("===========================================");

        double sum = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 406d && v < 407d).sum(); //check 106-107 is 0
        System.out.println("Sum is " + sum);
        System.out.println("------------------------------------");

        sum = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 406d && v < 407d).reduce(0d, (a, b) -> a + b); //check 106-107 is 0
        System.out.println("Sum is " + sum);
        System.out.println("------------------------------------");

        OptionalDouble sum2 = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 406d && v < 407d).reduce((v1, v2) -> v1 + v2); //check 106-107 is empty
        System.out.println("Sum is " + (sum2.isPresent() ? sum2.getAsDouble() : "empty"));
        System.out.println("------------------------------------");

        OptionalDouble min = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 306d && v < 507d).reduce((v1, v2) -> (v1 < v2 ? v1 : v2));
        System.out.println("Min is " + (min.isPresent() ? min.getAsDouble() : "empty"));
        System.out.println("------------------------------------");

        OptionalDouble max = readings.stream().mapToDouble(r -> r.getValue())
                .filter(v -> v >= 406d && v < 407d).reduce((v1, v2) -> (v1 > v2 ? v1 : v2));
        max.ifPresent(v -> System.out.println("Max is " + v));
        System.out.println("------------------------------------");
    }

    @Data
    static class Reading {
        final int year;
        final int month;
        final int day;
        final double value;

        public Reading(int year, int month, int day, double value) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.value = value;
        }
    }
}
