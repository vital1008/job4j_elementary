package ru.job4j.condition;

public class Max {
    public static int max (int left, int right) {
        boolean max = true;
        return left > right ?  left : right;
    }

    public static void main(String[] args) {
        int max = Max.max(10, 256);
        System.out.println(max);

    }

}
