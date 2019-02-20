package com.company;

public class Main11 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (Exception e){
            if (e instanceof RuntimeException){
                RuntimeException re = (RuntimeException) e;
                System.err.print("This is Runtime Exception, indeed");
            }else {
                System.err.print("Why isn't Runtime Exception");
            }
        }
    }
}
