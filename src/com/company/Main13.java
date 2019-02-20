package com.company;

public class Main13 {
    public static void main(String[] args) {
        try{
            System.err.println("0");
            if (true) throw new Error();
            System.err.println("1");
        }catch (Exception e){
            System.err.println("2");
        }
        System.err.print("3");
    }
}
