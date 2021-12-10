package erkan_karatas;

public interface ZoneCounterInterface {
    /**
     * Ek olarak bir Init metodu yazmaya gerek olmamalı.
     * Constructor ile map map datasını besleyebiliriz.
     */
    // Feeds map data into solution class, then get ready for Solve() method.
    void Init(MapInterface map) throws Exception;
    // Count zones in map provided with Init() method, then return the result.
    int Solve() throws Exception;
}
