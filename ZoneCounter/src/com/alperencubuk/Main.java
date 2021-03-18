package com.alperencubuk;

public class Main {
    public static void main(String[] args) throws Exception {
        MapInterface map = new Map();
        Dimension dim = new Dimension(36,24);
        map.setSize(dim);

        map.setBorder(0,0);
        map.clearBorder(0,0);

        map.setBorder(18,0);
        map.setBorder(24,0);

        map.setBorder(16,1);
        map.setBorder(17,1);
        map.setBorder(24,1);

        map.setBorder(15,2);
        map.setBorder(24,2);

        map.setBorder(14,3);
        map.setBorder(25,3);

        map.setBorder(12,4);
        map.setBorder(13,4);
        map.setBorder(25,4);

        map.setBorder(11,5);
        map.setBorder(26,5);
        map.setBorder(35,5);

        map.setBorder(10,6);
        map.setBorder(26,6);
        map.setBorder(27,6);
        map.setBorder(28,6);
        map.setBorder(29,6);
        map.setBorder(30,6);
        map.setBorder(31,6);
        map.setBorder(32,6);
        map.setBorder(33,6);
        map.setBorder(34,6);

        map.setBorder(8,7);
        map.setBorder(9,7);
        map.setBorder(26,7);

        map.setBorder(7,8);
        map.setBorder(27,8);

        map.setBorder(5,9);
        map.setBorder(6,9);
        map.setBorder(27,9);

        map.setBorder(4,10);
        map.setBorder(5,10);
        map.setBorder(27,10);

        map.setBorder(3,11);
        map.setBorder(6,11);
        map.setBorder(28,11);

        map.setBorder(2,12);
        map.setBorder(7,12);
        map.setBorder(28,12);

        map.setBorder(0,13);
        map.setBorder(1,13);
        map.setBorder(7,13);
        map.setBorder(25,13);
        map.setBorder(26,13);
        map.setBorder(27,13);
        map.setBorder(28,13);
        map.setBorder(29,13);

        map.setBorder(8,14);
        map.setBorder(21,14);
        map.setBorder(22,14);
        map.setBorder(23,14);
        map.setBorder(24,14);
        map.setBorder(29,14);

        map.setBorder(8,15);
        map.setBorder(17,15);
        map.setBorder(18,15);
        map.setBorder(19,15);
        map.setBorder(20,15);
        map.setBorder(29,15);

        map.setBorder(9,16);
        map.setBorder(13,16);
        map.setBorder(14,16);
        map.setBorder(15,16);
        map.setBorder(16,16);
        map.setBorder(30,16);

        map.setBorder(9,17);
        map.setBorder(10,17);
        map.setBorder(11,17);
        map.setBorder(12,17);
        map.setBorder(30,17);

        map.setBorder(10,18);
        map.setBorder(31,18);

        map.setBorder(10,19);
        map.setBorder(31,19);

        map.setBorder(11,20);
        map.setBorder(31,20);

        map.setBorder(11,21);
        map.setBorder(32,21);

        map.setBorder(12,22);
        map.setBorder(32,22);

        map.setBorder(12,23);
        map.setBorder(33,23);

        map.show();

        ZoneCounterInterface zoneCounter = new ZoneCounter();
        zoneCounter.init(map);

        int result = zoneCounter.solve();
        System.out.println("Result: " + result);
    }
}
