package ru.job4j.condition;

public class PointEq {
    public static boolean ed(int x1, int y1, int x2, int y2) {
        boolean edX = x1 == x2;
        boolean edY = y1 == y2;
        return edX && edY;
    }
    public static void main(String[] args) {
        System.out.println(ed(1,1,2,2));
        System.out.println(ed(10,10,10,10));
    }
}
