package erkan_karatas;

import java.util.ArrayList;
import java.util.List;

public class ZoneCounter implements ZoneCounterInterface {
    MapInterface map;
    public void Init(MapInterface map) throws Exception {
        this.map = map;
    }
    List<Zone> zones=new ArrayList<>();
    Dimension dimension = new Dimension(0, 0);
    class Zone{
        List<Point> points = new ArrayList<>();
        public int area(){
            return this.points.size();
        }

        public boolean hasPoint(Point point) {
            for (Point point1 : this.points) {
                if(point1.equals(point)){
                    return true;
                }
            }
            return false;
        }

        public void expand(Point point, MapInterface map, int c) throws Exception {
            if(this.hasPoint(point)){
                return;
            }
            this.points.add(point);
            boolean isUpBorder = map.IsBorder(point.x+1, point.y);
            if(!isUpBorder){
                this.expand(new Point(point.x+1, point.y), map, c);
            }
            if(!map.IsBorder(point.x, point.y + 1)){
                this.expand(new Point(point.x, point.y+1), map, c);
            }
            if(!map.IsBorder(point.x, point.y - 1)){
                this.expand(new Point(point.x, point.y-1), map, c);
            }
            System.out.println("Added point to zone " +c+ " " + point.x +":"+ point.y);
        }
    }
    public Zone getZone(Point point){
        for (Zone zone : this.zones) {
            if(zone.hasPoint(point)){
                return zone;
            }
        }
        return null;
    }
    public int Solve() throws Exception {
        this.map.GetSize(dimension);
        int zoneCount = 1;
        int pointCount = 0;

        int startx=0;
        int starty=0;

        for (int y = starty; y<dimension.height; y++){
            for(int x = startx; x < dimension.width; x++){
                Point point = new Point(x,y);
                if(x==0 && y==5){
                    System.out.println("h");
                }
                if (this.map.IsBorder(x,y)){
                    continue;
                } else {
                    Zone zone = this.getZone(point);
                    if(zone==null){
                        zone= new Zone();
                        zone.expand(point,this.map, zoneCount++);
                        this.zones.add(zone);
                    }



                }
            }


        }
        int zc=0;
        for (Zone zone : this.zones) {
             System.out.println("zone "+ ++zc +" Area "+zone.area());
        }
        System.out.println(this.zones.size());

        return pointCount;
    }


}