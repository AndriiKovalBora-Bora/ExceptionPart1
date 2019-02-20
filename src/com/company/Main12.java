package com.company;

public class Main12 {
    public static void main(String[] args) throws Exception {
        try {
            System.err.println(" 0");
            if (true) throw new Exception();
            System.err.print(" 1");
        }catch (RuntimeException exp){
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}
