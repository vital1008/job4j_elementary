package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl1=  p / (2 * (k + 1));
        double rsl2=rsl1*k;
        double rsl3=rsl2*rsl1;
        return rsl3;
    }

    public static void main(String[] args) {
        double rsl3=SqArea.square(6,2);
        System.out.println("p=4, k=2, s=2 = real " + rsl3);
    }
}