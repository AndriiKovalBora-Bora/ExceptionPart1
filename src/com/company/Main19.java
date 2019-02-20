package com.company;

public class Main19 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("1");
        } catch (Exception e) {
            System.err.println("2");
        } catch (Throwable t) {
            System.err.println("3");
        }
    }
}
