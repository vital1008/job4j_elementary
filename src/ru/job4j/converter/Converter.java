package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int euro = value / 70;
        return euro;
    }

    public static int rubleToDollar(int value) {
        int dollar = value / 60;
        return dollar;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are - " + "" + euro + " " + "euro.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro (in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 . Test result : " + passed);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are - " + "" + dollar + " " + "dollar.");
        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar (in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);
    }
}


