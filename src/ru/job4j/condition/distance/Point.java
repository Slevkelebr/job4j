package ru.job4j.condition.distance;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * class Point - расчет расстояние между точками в системе координат.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.2
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
     * Конструктор для точки.
     * @param x первая координата.
     * @param y вторая координата.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод distance расчитывает расстояние между двумя точка в системе координат.
     * @param that точка в системе координа.
     * @return расстояние между точками.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

}
