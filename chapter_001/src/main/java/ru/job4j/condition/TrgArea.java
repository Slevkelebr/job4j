package ru.job4j.condition;

/**
 * Класс вычисляет площадь треугольника по формуле Герона.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class TrgArea {

    private Point first;
    private Point second;
    private Point third;

    public TrgArea(Point ab, Point ac, Point bc) {
        this.first = ab;
        this.second = ac;
        this.third = bc;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        if (this.exist(a, b, c)) {
            double perimeter = (a + b + c) / 2;
            rsl = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        return (a + b > c && b + c > a && a + b > c);
    }
}
