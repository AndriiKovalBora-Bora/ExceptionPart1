package com.company;

public class Main31 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}
