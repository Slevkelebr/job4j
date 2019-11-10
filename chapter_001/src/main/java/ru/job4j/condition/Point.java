package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Класс вычисляет расстояние между точками в системе координат.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Point {

    /**
     * Первая координата точки в системе координат.
     */
    private int x;
    /**
     * Вторая координа точки в системе координат.
     */
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод расчитывает расстояние между точками в системе координат.
     * @param that координаты второй точки.
     * @return расстояние между точками в системе координат.
     */
    public double distance(Point that) {
       return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
       Point a = new Point(0, 0);
       Point b = new Point(0, 2);
       double dist = a.distance(b);
        System.out.println(dist);
    }
}