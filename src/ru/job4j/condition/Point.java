package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println(" Point.distance (0,0 _ to (2,0) " + " =  "  + result);
        int in1 = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
        int expected = 2;
        double out = Point.distance(in1, in2, in3, in4);
        boolean passed = expected == out;
        System.out.println(" Point.distance (0,0 _ to (2,0)).Test result " + passed);

    }
}