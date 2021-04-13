package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double square = l * k;
        return square;
    }
    public static void main(String[] args) {
        double square = SqArea.square(6, 2);
        System.out.println("p=6, k=2, s=1 = real " + square);
        int in1 = 6;
        double in2 = 2;
        int expected = 4;
        double out = SqArea.square(in1, in2);
        boolean passed = expected == out;
        System.out.println("p=6, k=2, s=1 = real. Test result: " + passed);

    }
}