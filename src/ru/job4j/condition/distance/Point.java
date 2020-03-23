package ru.job4j.condition.distance;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * class Point - расчет расстояние между точками в системе координат и в трехмерном пространстве.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.3
 * @since 23.03.2020
 */
public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     * Кооридната точки.
     */
    private int x;
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     * Кооридната точки.
     */
    private int y;
    /**
     * Кооридната точки.
     */
    private int z;
    /**
     * Конструтор, который принимает начальное состояние объекта "точка".
     * @param x координата x.
     * @param y координата y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка".
     * @param x координата x.
     * @param y координата y.
     * @param z координата y.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод distance расчитывает расстояние между двумя точка в системе координат.
     * @param that точка в системе координа.
     * @return расстояние между точками.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод distance расчитывает расстояние между двумя точками пространстве.
     * @param that точка в системе координа.
     * @return расстояние между точками.
     */
    public double distance3D(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }
}
