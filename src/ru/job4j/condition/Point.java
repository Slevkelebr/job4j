package ru.job4j.condition;

/**
 * class Point - расчет расстояние между точками в системе координат .
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 21.03.2020
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
        System.out.println("result (3, 5) to (2, 1) = " + Point.distance(3, 5, 2, 1));
    }
}
