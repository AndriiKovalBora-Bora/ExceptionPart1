package com.company;

public class Main14 {
    public static void main(String[] args) {
        try {
            System.err.println("0");
            if(true) throw new RuntimeException();
            System.err.println("1");
        }catch (RuntimeException e){
            System.err.println("2");
            if (true) throw new Error();
        }
        System.err.println("3");
    }
}
