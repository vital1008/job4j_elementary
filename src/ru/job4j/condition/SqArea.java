package ru.job4j.condition;

public class SqArea {
    public static double square(double p, int k) {
        double result1=p / (2 * (k + 1))*k*(p / (2 * (k + 1)));
        return result1;

        }

    public static void main(String[] args) {
        double result1=SqArea.square(6,2);
        System.out.println("p=6,k=2, s=1, real="+result1);

    }

        }




