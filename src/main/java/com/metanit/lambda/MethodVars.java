package com.metanit.lambda;

public class MethodVars {
    public static void main(String[] args) {
        int n = 70;
        int m = 30;
        Operation op = () -> {

            //n=100; - так нельзя сделать
            return m + n;
        };
        //n=100;  //- так тоже нельзя
        System.out.println(op.calculate()); // 100
    }
}

interface Operation{
    int calculate();
}