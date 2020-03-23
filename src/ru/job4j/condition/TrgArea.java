package ru.job4j.condition;

import ru.job4j.condition.distance.Point;

/**
 * class TrgArea - расчет площади треугольника.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.2
 * @since 23.03.2020
 */
public class TrgArea {
    /**
     * Вершина треугольника.
     */
    private Point first;
    /**
     * Вершина треугольника.
     */
    private Point second;
    /**
     * Вершина треугольника.
     */
    private Point third;

    /**
     * Конструктор класса TrgArea.
     * @param first первая вершина треугольника.
     * @param second вторая вершина треугольника.
     * @param third третья вершина треугольника.
     */
    public TrgArea(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод вычисляет площадь треугольника.
     *
     * Формула.
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки a b.
     * @param bc Длина от точки a c.
     * @param ac Длина от точки b c.
     * @return true если треугольник существует иначе false.
     */
    public boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            result = true;
        }
        return result;
    }
}
