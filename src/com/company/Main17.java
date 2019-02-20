package com.company;

public class Main17 {
    public static void main(String[] args) {
        try {
            System.err.println("0");
            if (true) throw new RuntimeException();
            System.err.println("1");
        } catch (RuntimeException e) {
            System.err.println("2.1");
            try {
                System.err.println("2.2");
                if (true) throw new Error();
                System.err.println("2.3");
            } catch (Throwable t) {
                System.err.println("2.4");
            }
            System.err.println("2.5");
        } catch (Error e) {
            System.err.println("3");
        }
        System.err.println("4");
    }
}