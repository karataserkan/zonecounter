package erkan_karatas;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        ZoneCounterInterface zoneCounter = new ZoneCounter();
        MapInterface map = new Map();

        int[][] a = {
                {0,0,1,0,0,0,0,0,0,0},
                {0,0,1,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1},
                {0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,0},
        };

        int width = a.length;
        int height = a[0].length;
        map.SetSize(new Dimension(width, height));
        for (int x = 0; x < width; x++) {
            for(int y=0;y< height;y++){
                if (a[x][y] == 1){
                    map.SetBorder(x,y);
                }
            }
        }
        zoneCounter.Init(map);
        int count = zoneCounter.Solve();
        System.out.println("Zone count:" + count);
    }
}
