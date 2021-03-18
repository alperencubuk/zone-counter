package com.alperencubuk;

public interface ZoneCounterInterface {
    // Feeds map data into solution class, then get ready for solve() method.
    void init(MapInterface map) throws Exception;
    // Counts zones in map provided with init() method, then return the result.
    int solve() throws Exception;
}
