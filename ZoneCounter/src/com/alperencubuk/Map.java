package com.alperencubuk;

public class Map implements MapInterface {
    private boolean[][] map;
    private Dimension dim;

    // Creates / Allocates a map of given size.
    public void setSize(Dimension dim) throws Exception {
        if (dim != null) {
            map = new boolean[dim.getWidth()][dim.getHeight()];
            this.dim = dim;
        } else {
            throw new NullPointerException("setSize: Dimension is null");
        }
    }

    // Get dimensions of given map.
    public Dimension getSize() {
        return dim;
    }

    // Sets border at given point.
    public void setBorder(int x, int y) throws Exception {
        if (dim.checkWithin(x, y)) {
            map[x][y] = true;
        } else {
            throw new ArrayIndexOutOfBoundsException("setBorder: Coordinates are invalid");
        }
    }

    // Clears border at given point.
    public void clearBorder(int x, int y) throws Exception {
        if (dim.checkWithin(x, y)) {
            map[x][y] = false;
        } else {
            throw new ArrayIndexOutOfBoundsException("clearBorder: Coordinates are invalid");
        }
    }

    // Checks if given point is border.
    public boolean isBorder(int x, int y) throws Exception {
        if (dim.checkWithin(x, y)) {
            return map[x][y];
        } else {
            throw new ArrayIndexOutOfBoundsException("isBorder: Coordinates are invalid");
        }
    }

    // Show map contents.
    public void show() {
        for (int i = 0; i < dim.getHeight(); i++) {
            for (int j = 0; j < dim.getWidth(); j++) {
                if (map[j][i]) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

}
