package com.midway.ocp8.stream;

import br.fernando.ch06_generics_and_collections_Objective.part03_Using_Collections.Test02;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
        List<DVDInfo> dvdList = getDVDInfoList();
        System.out.println("-------------- All DVDs ---------------------");
        dvdList.forEach(System.out::println);
        System.out.println("-------------- Filter by genre ---------------------");
        List<DVDInfo> sfDvdList = dvdList.stream().filter(d -> d.getGenre().equalsIgnoreCase("sci-fi")).collect(Collectors.toList());
        sfDvdList.forEach(System.out::println);
    }

    private static List<DVDInfo> getDVDInfoList() {
        List<DVDInfo> dvdList = new ArrayList<>();

        try {
            Stream<String> stream = Files.lines(Paths.get("c:\\Git\\OCP-Java8\\src\\main\\resources\\dvdinfo.txt"));
            stream.forEach(l -> {
                String[] dvd = l.split("/");
                DVDInfo dvdInfo = new DVDInfo(dvd[0], dvd[1], dvd[2]);
                dvdList.add(dvdInfo);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dvdList;
    }


    @Data
    static class DVDInfo {

        private String title;
        private String genre;
        private String leadActor;

        public DVDInfo(final String title, final String genre, final String leadActor) {
            super();
            this.title = title;
            this.genre = genre;
            this.leadActor = leadActor;
        }

        public String toString() {
            return new StringBuilder("title: ").append(title)
                    .append("   genre: ").append(genre)
                    .append("   leadActor: ").append(leadActor)
                    .toString();
        }
    }
}
