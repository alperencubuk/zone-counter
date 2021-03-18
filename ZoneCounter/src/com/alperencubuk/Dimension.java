package com.alperencubuk;

public class Dimension {
    // Members can only initialize in the constructor so must be final.
    // If necessary setWidth(int w) / setHeight(int h) can be implemented.
    // If set methods implemented final keywords must be deleted.
    private final int width;
    private final int height;

    // Dimensions must be positive.
    public Dimension(int w, int h) throws Exception {
        if (w > 0 && h > 0) {
            width = w;
            height = h;
        } else {
            throw new IllegalArgumentException("Dimension: Width or Height is invalid.");
        }
    }

    // Get method for access width value.
    public int getWidth() {
        return width;
    }

    // Get method for access height value.
    public int getHeight() {
        return height;
    }

    // Validation for x,y coordinates.
    public boolean checkWithin(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

}
