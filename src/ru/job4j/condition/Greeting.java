package ru.job4j.condition;

public class Greeting {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        String idea;
        idea = "I like Java";
        System.out.println(idea);
        idea = idea + "" + ", But i am newbie,";
        int year = 2021; idea = idea + year;
        System.out.println(idea);
    }
}
