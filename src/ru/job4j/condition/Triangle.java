package ru.job4j.condition;

public class Triangle {
     public static boolean exist(double ab, double ac, double bc) {
         boolean exist = ab + ac > bc && ac + bc > ab && ab + bc > ac;
         return false;
     }

    public static void main(String[] args) {
        exist(2.0, 2.0, 2.0);
    }
}
