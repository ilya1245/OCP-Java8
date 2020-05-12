package com.midway.ocp8.stream;

import com.midway.ocp8.model.DVDInfo;
import com.midway.ocp8.model.Person;
import com.midway.ocp8.util.Constants;
import com.midway.ocp8.util.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {
        List<Person> people = Utils.getPersonList();

        List<Person> peopleAge34 = people.stream() // stream the people
                .filter(d -> d.getAge() == 34) // find people age 34
                //.collect(Collectors.toCollection(ArrayList::new)); if ArrayList is needed
                .collect(Collectors.toList()); // collect 34s into a new List

        System.out.println("People aged 34: " + peopleAge34);
        System.out.println("------------------------------------");
        getUserList();
        System.out.println("------------------------------------");
        getDvdInfoList();

    }

    private static List<String> getUserList() {
        List<String> users = new ArrayList<>();

        try (final Stream<String> stream = Files.lines(Paths.get(Constants.USERS_FILE_PATH))) {
            users = stream.collect(Collectors.toList()); // collect names
            users.forEach(System.out::println); // print names
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static List<DVDInfo> getDvdInfoList() {
        List<DVDInfo> dvdList = new ArrayList<>();

        try (final Stream<String> stream1 = Files.lines(Paths.get(Constants.DVDINFO_FILE_PATH));
             final Stream<String> stream2 = Files.lines(Paths.get(Constants.DVDINFO_FILE_PATH))) {

            // Version1
            dvdList = stream1.map(l -> {
                String[] dvd = l.split("/");
                return new DVDInfo(dvd[0], dvd[1], dvd[2]);
            }).collect(Collectors.toList()); // collect names
            dvdList.forEach(System.out::println); // print names
            System.out.println("------------------------------------");

            // Version2
            dvdList = stream2.map(l -> l.split("/"))
                    .map(s -> new DVDInfo(s[0], s[1], s[2]))
                    .collect(Collectors.toList());

            dvdList.forEach(System.out::println); // print names
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dvdList;
    }

}


