package com.company;

public class Main28 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) return;
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");

    }
}
