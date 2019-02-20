package com.company;

public class Main35 {
    public static void main(String[] args) {
        try {
            System.err.println("0");
            if (true) throw new Error();
            System.err.println("1");
        } catch (Error e) {
            System.err.println("2");
        } finally {
            System.err.println("3");
        }
        System.err.println("4");
    }
}