package com.company;

public class Main5 {
    public static void main(String[] args) {
        double d = sqr(10.0);

        System.out.println(d);
    }

    public static double sqr(double d) {
        throw new RuntimeException();
    }
}
