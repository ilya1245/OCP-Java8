package com.midway.ocp8.lambda.practice.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator comparator = new Comparator();
        comparator.setArrays(arrays);

        comparator.doComparisonAsc();
        arrays.stream().map(Arrays::toString).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        comparator.doComparisonDesc();
        arrays.stream().map(Arrays::toString).forEach(System.out::println);
        System.out.println("=============================================");

        comparator.doComparisonLambdaAsc();
        arrays.stream().map(Arrays::toString).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        comparator.doComparisonLambdaDesc();
        arrays.stream().map(Arrays::toString).forEach(System.out::println);

    }


}
