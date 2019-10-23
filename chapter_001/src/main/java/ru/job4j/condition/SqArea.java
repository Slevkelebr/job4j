package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int height = (p / 2) / (k + 1);
        int length = height * k;
        return height * length;
    }

    public static void main(String[] args) {
        double result = square(4,1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result1 = square(6,2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
