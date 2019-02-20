package com.company;

public class Main27 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}
