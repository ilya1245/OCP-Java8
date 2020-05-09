package com.midway.ocp8.stream;

import com.midway.ocp8.model.DVDInfo;
import com.midway.ocp8.util.Utils;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFiltering {
    public static void main(String[] args) {
        doSimpleFiltering();
        System.out.println();
        doFileLineFiltering();
        System.out.println();
        doChainFiltering();

    }

    private static void doSimpleFiltering() {
        //Stream creation
        Integer[] myNums = { 1, 2, 3 };
        Stream<Integer> myStream = Stream.of(myNums);

        long numOfElements = myStream.filter(i -> i > 1).count();
        System.out.println("Number of elements > 1: " + numOfElements);

        numOfElements = Arrays.stream(myNums).filter(i -> i > 2).count();
        System.out.println("Number of elements > 2: " + numOfElements);
    }

    private static void doFileLineFiltering() {
        List<DVDInfo> dvdList = Utils.getDVDInfoList();
        System.out.println("-------------- All DVDs ---------------------");
        dvdList.forEach(System.out::println);
        System.out.println("-------------- Filter by genre ---------------------");
        List<DVDInfo> sfDvdList = dvdList.stream().filter(d -> d.getGenre().equalsIgnoreCase("sci-fi")).collect(Collectors.toList());
        sfDvdList.forEach(System.out::println);
    }

    private static void doChainFiltering() {
        List<String> names = Arrays.asList("Boi", "Charis", "Zooey", "Bokeh", "Clover", "Aiko");

        names.stream() // create the stream
                .filter(s -> s.startsWith("B") || s.startsWith("C")) // filter by first letter
                .filter(s -> s.length() > 3) // Filter by length - Boi out
                .forEach(System.out::println); // print
//        ; srteam won't work if uncommented
    }

}
