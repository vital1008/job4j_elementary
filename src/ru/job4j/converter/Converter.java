package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
     int rsl = value/70;
     return rsl;
    }
    public static float rubleToDollar(float value){
        float rsl = value/60;
        return rsl;
    }
    public static void main(String[] args) {
        int Euro=Converter.rubleToEuro(140);
        System.out.println(Euro);
        float Dollar=Converter.rubleToDollar(140);
        System.out.println(Dollar);

    }


}
