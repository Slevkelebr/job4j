package ru.job4j.condition;

/**
 * Класс вычисляет площадь треугольника по формуле Герона.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class TrgArea {

    /**
     * Метод вычисялет площадь треугольника.
     * @param a сторона треугольника.
     * @param b сторона треугольника.
     * @param c сторона треугольника.
     * @return площадь треугольника.
     */
    public static double area(double a, double b, double c) {
        double perimeter = (a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

    public static void main(String[] args) {
        double rs1 = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rs1);
    }
}
