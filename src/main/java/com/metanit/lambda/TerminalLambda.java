package com.metanit.lambda;

//Terminal lambda - don't return any result
public class TerminalLambda {
    public static void main(String[] args) {
        Printable printer = s -> System.out.println(s);
        printer.print("Hello, world");
    }
}

interface Printable{
    void print(String s);
}


