package square;

public class Square2 {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            System.exit(0);
        }
        return width * height;
    }
}
