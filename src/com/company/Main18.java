package com.company;

public class Main18 {
    public static void main(String[] args) {
        try {
        } catch (RuntimeException e) {
            System.err.println("1");
        } catch (Error e) {
            System.err.println("2");
        }
    }
}
