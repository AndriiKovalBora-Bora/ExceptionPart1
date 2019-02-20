package square;

public class Square1 {
    public static int are(int width, int height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }
}
