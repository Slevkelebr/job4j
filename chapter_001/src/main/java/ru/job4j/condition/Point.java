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
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка".
     * @param first координата х.
     * @param second координата y.
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор, который принимает начальное состояние объекта "точка".
     * @param first координата х.
     * @param second координата y.
     * @param third координата z.
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * Метод расчитывает расстояние между точками в системе координат.
     * @param that координаты второй точки.
     * @return расстояние между точками в системе координат.
     */
    public double distance(Point that) {
       return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод расчитывает расстояние между точками в 3д прострастве.
     * @param that координаты второй точки.
     * @return расстояние между точками.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
       Point a = new Point(0, 0);
       Point b = new Point(0, 2);
       double dist = a.distance(b);
        System.out.println(dist);
    }
}