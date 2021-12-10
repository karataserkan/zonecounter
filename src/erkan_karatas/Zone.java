package erkan_karatas;

import java.util.ArrayList;
import java.util.List;

class Zone{
    List<Point> points = new ArrayList<>();

    public boolean hasPoint(Point point) {
        return this.points.contains(point);
    }

    public void expand(Point point, MapInterface map) throws Exception {
        if(this.hasPoint(point)){
            return;
        }
        this.points.add(point);
        if(!map.IsBorder(point.x+1, point.y)){
            this.expand(new Point(point.x+1, point.y), map);
        }
        if(!map.IsBorder(point.x-1, point.y)){
            this.expand(new Point(point.x-1, point.y), map);
        }
        if(!map.IsBorder(point.x, point.y + 1)){
            this.expand(new Point(point.x, point.y+1), map);
        }
        if(!map.IsBorder(point.x, point.y - 1)){
            this.expand(new Point(point.x, point.y-1), map);
        }
    }
}
