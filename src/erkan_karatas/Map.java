package erkan_karatas;

import java.util.HashSet;
import java.util.Set;

public class Map implements MapInterface{

    Dimension dim;
    Set<Point> borders = new HashSet<>();

    @Override
    public void SetSize(Dimension dim) {
        this.dim = dim;
    }

    @Override
    public void GetSize(Dimension dim) {
        dim.width = this.dim.width;
        dim.height = this.dim.height;
    }
    
    @Override
    public void SetBorder(int x, int y) throws Exception {
        this.borders.add(new Point(x, y, true));
    }

    @Override
    public void ClearBorder(int x, int y) throws Exception {
        this.borders.removeIf(border -> border.getX() == x && border.getY() == y);
    }

    @Override
    public boolean IsBorder(int x, int y) throws Exception {
        if(!this.dim.CheckWithin(x, y)){
            return true;
        }
        return this.borders.contains(new Point(x, y, true));
    }

    @Override
    public void Show() {
    }
}
