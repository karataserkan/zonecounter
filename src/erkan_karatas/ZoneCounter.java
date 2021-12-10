package erkan_karatas;

import java.util.ArrayList;
import java.util.List;

public class ZoneCounter implements ZoneCounterInterface {
    MapInterface map;
    public void Init(MapInterface map) {
        this.map = map;
    }
    List<Zone> zones=new ArrayList<>();
    Dimension dimension = new Dimension(0, 0);

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

        for (int y = 0; y<dimension.height; y++){
            for(int x = 0; x < dimension.width; x++){
                Point point = new Point(x,y);
                if (!this.map.IsBorder(x,y)){
                    Zone zone = this.getZone(point);
                    if(zone==null){
                        zone= new Zone();
                        zone.expand(point,this.map);
                        this.zones.add(zone);
                    }
                }
            }
        }

        return this.zones.size();
    }


}