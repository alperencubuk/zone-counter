package com.alperencubuk;

public class ZoneCounter implements ZoneCounterInterface {
    private MapInterface map;

    // Feeds map data into solution class, then get ready for solve() method.
    public void init(MapInterface map) throws Exception {
        if (map != null) {
            this.map = map;
        } else {
            throw new NullPointerException("init: Map is null");
        }
    }

    public int solve() throws Exception {
        if (map != null) {
            int width = map.getSize().getWidth();
            int height = map.getSize().getHeight();
            // This array will be using for finding areas with Seed Fill Algorithm.
            // Java auto filled this array to zeros.
            boolean[][] filled = new boolean[width][height];

            int areas = 0;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    // If our location is not a border and not filled call fill method.
                    if (!map.isBorder(i, j) && !filled[i][j]) {
                        fill(i, j, width, height, filled);
                        // Area found.
                        areas++;
                    }
                }
            }
            return areas;
        } else {
            return 0;
        }
    }

    // Seed Fill Algorithm was used which is described below link:
    // https://ceng2.ktu.edu.tr/~cakir/files/graflab/foyler/3_Yuzey_Doldurma.pdf
    // Only used in this class so this method must be defined here and must be private.
    private void fill(int x, int y, int width, int height, boolean[][] filled) throws Exception {
        if (!map.isBorder(x, y) && !filled[x][y]) {
            filled[x][y] = true;
            if (x < width - 1)
                fill(x + 1, y, width, height, filled);
            if (y < height - 1)
                fill(x, y + 1, width, height, filled);
            if (x > 0)
                fill(x - 1, y, width, height, filled);
            if (y > 0)
                fill(x, y - 1, width, height, filled);
        }
    }

}
