package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello , "  + name  +  -age);
    }

    public static void main(String[] args) {
        String name = "Peter Arsentev";
        int age = 33;
        ArgMethod.hello(name,  age);
    }
}
