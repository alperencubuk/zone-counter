package com.alperencubuk;

public interface MapInterface {
    // Creates / Allocates a map of given size.
    void setSize(Dimension dim) throws Exception;
    // Get dimensions of given map.
    Dimension getSize();
    // Sets border at given point.
    void setBorder(int x, int y) throws Exception;
    // Clears border at given point.
    void clearBorder(int x, int y) throws Exception;
    // Checks if given point is border.
    boolean isBorder(int x, int y) throws Exception;
    // Show map contents.
    void show();
}
