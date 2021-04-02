package ru.job4j.condition;

public class Point {
    public static double distance(int x1 , int y1, int x2, int y2){
        double rsl1 =x2-x1;
        return rsl1;
        double rsl2= y2-y1;
        return rsl2;
        double rsl3 = Math.pow(rsl1, 2);
        return rsl3;
        double rsl4 = Math.pow(rsl2, 2);
        return rsl4;
        double rsl5 = rsl3 + rsl4;
        double result = Math.sqrt(rsl5);
        return result;
    }

    public static void main(String[] args) {
        double result=Point.distance(0,0,2,0);
        System.out.println("result (0,0_ to (2,0)");


    }
}



