package com.midway.ocp8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //Stream creation
        Integer[] myNums = { 1, 2, 3 };
        Stream<Integer> myStream1 = Arrays.stream(myNums);
        Stream<Integer> myStream2 = Stream.of(myNums);
        Stream<Integer> myStream3 = Stream.of(1, 2, 3);

        long[] numOfElements1 = new long[3];
        numOfElements1[0] = myStream1.count();
        numOfElements1[1] = myStream2.count();
        numOfElements1[2] = myStream3.count();

        Stream.of(numOfElements1).forEach(System.out::println);
        Arrays.asList(numOfElements1).forEach(System.out::println);
        System.out.println("--------------------------------------------");

        myStream1 = Arrays.stream(myNums);
        myStream2 = Stream.of(myNums);
        myStream3 = Stream.of(1, 2, 3);

        Long[] numOfElements2 = new Long[3];
        numOfElements2[0] = myStream1.count();
        numOfElements2[1] = myStream2.count();
        numOfElements2[2] = myStream3.count();

        Stream.of(numOfElements2).forEach(System.out::println);
        Arrays.asList(numOfElements2).forEach(System.out::println);

    }
}
