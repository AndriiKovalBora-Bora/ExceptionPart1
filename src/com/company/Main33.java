package com.company;

public class Main33 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {

            }
            finished = true;
        } finally {
            if (finished) {

            } else {

            }
        }
        return 0;
    }
}
