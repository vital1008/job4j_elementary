package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 5, 6);
        System.out.println(" Point.distance (1,1 _ to (5,6) " + " =  "  + result);

    }
}