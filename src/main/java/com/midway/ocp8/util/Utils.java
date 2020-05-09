package com.midway.ocp8.util;

import com.midway.ocp8.model.DVDInfo;
import com.midway.ocp8.model.Dog;
import com.midway.ocp8.model.Duck;
import com.midway.ocp8.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Utils {
    public static List<Dog> getDogList() {
        final Dog aiko = new Dog("aiko", 10, 10);
        final Dog boi = new Dog("boi", 6, 6);
        final Dog charis = new Dog("charis", 7, 7);
        final Dog clover = new Dog("clover", 12, 12);
        final Dog zooey = new Dog("zooey", 8, 8);
        final Dog aiko2 = new Dog("aiko", 11, 14);

        return Arrays.asList(boi, aiko, charis, clover, zooey, aiko2);
    }

    public static List<Duck> getDuckList() {
        return Arrays.asList(
                new Duck("Jerry", "yellow", 3),
                new Duck("George", "brown", 4),
                new Duck("Krammer", "mottled", 6),
                new Duck("Elaine", "white", 2),
                new Duck("Huey", "mottled", 2),
                new Duck("Louie", "white", 4),
                new Duck("Dwey", "brown", 6));
    }

    public static List<Person> getPersonList() {
        return Arrays.asList(
                new Person("Beth", 30),
                new Person("Eric", 31),
                new Person("Deb", 31),
                new Person("Liz", 30),
                new Person("Wendi", 34),
                new Person("Kathy", 35),
                new Person("Bert", 32),
                new Person("Bill", 34),
                new Person("Robert", 38));
    }
    public static List<DVDInfo> getDVDInfoList() {
        List<DVDInfo> dvdList = new ArrayList<>();

        try {
            Stream<String> stream = Files.lines(Paths.get(Constants.DVDINFO_FILE_PATH));
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

}
