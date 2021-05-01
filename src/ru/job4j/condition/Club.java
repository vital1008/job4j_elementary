package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney = true) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
        if (beFriend = true) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}