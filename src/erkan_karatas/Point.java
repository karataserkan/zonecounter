package erkan_karatas;

import java.util.Objects;

public class Point {
    int x;
    int y;
    boolean isBorder = false;

    public Point(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public Point(int x, int y, boolean isBorder){
        this(x, y);
        this.setBorder(isBorder);
    }

    public void setBorder(boolean border) {
        isBorder = border;
    }

    public boolean isBorder() {
        return isBorder;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && isBorder == point.isBorder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, isBorder);
    }
}
