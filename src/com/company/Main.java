package com.company;

public class Main {

    public static void main(String[] args) throws Throwable {
        try {
            throw new Error();
        } catch (Throwable t) {
        }

    }
}
