package app;

public class App6 {
    public static double sqr(double arg) {

        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
        } else if (time % 2 == 1) {
            while (true) ;
        } else {
            throw new RuntimeException();
        }
    }
}
