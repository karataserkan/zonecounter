package erkan_karatas;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        ZoneCounterInterface zoneCounter = new ZoneCounter();
        MapInterface map = new Map();
        //map.SetSize(new Dimension(36, 24));
        map.SetSize(new Dimension(7, 5));

        int[][] a =
                {
                        {0,0,0,0,1,0,0,},
                        {1,1,1,1,0,1,1,},
                        {0,0,0,1,0,0,0,},
                        {0,0,0,0,1,0,0,},
                        {0,0,0,0,0,1,0,},

                };
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j< a[i].length;j++){
                if (a[i][j] == 1){
                    map.SetBorder(j,i);
                }
            }
        }
        zoneCounter.Init(map);
        int count = zoneCounter.Solve();
        System.out.println(count);
    }
}
