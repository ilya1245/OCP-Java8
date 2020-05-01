package com.midway.ocp8.lambda.practice.compare;

import java.util.ArrayList;
import java.util.List;

public class Comparator {


    private List<String[]> arrays = new ArrayList<>();


    public void doComparisonAsc() {
        arrays.sort(new java.util.Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });
    }

    public void doComparisonDesc() {
        arrays.sort(new java.util.Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2.length - o1.length;
            }
        });
    }

    public void doComparisonLambdaAsc() {
        arrays.sort((o1, o2) -> o1.length - o2.length);
    }

    public void doComparisonLambdaDesc() {
        arrays.sort((o1, o2) -> o2.length - o1.length);
    }



    public List<String[]> getArrays() {
        return arrays;
    }

    public void setArrays(List<String[]> arrays) {
        this.arrays = arrays;
    }
}
