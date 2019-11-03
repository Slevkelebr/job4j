package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        return Math.sqrt(Math.pow(first, 2) * Math.pow(second, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = distance(2, 3, 5, 6);
        System.out.println("result2 (2, 3) to (5, 6) " + result2);
    }
}
