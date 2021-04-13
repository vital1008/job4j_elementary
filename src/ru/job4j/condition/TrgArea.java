package ru.job4j.condition;

public class TrgArea {
    public static double area (int a, int b, int c) {
        int p = (a + b + c) / 2;
        double rsl = Math.sqrt((p - a) * (p - b) * (p - c) * p);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2,2,2)=" + rsl);
        int in1 = 2;
        int in2 = 2;
        int in3 = 2;
        double expected = 1.7320508075688772;
        double out = TrgArea.area(in1, in2, in3);
        boolean passed = expected == out;
        System.out.println("Area (2,2,2). Test result " + passed);

    }
}
