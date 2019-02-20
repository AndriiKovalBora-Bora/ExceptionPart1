package square;

public class Square {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("not so good");
        }
        return width * height;
    }
}
