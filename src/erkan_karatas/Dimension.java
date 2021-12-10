package erkan_karatas;

public class Dimension {
    public Dimension(int w, int h) {
        width = w;
        height = h;
    }
    public boolean CheckWithin(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }
    public int width, height;
}