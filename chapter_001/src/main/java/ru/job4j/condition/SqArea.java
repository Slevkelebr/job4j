package ru.job4j.condition;

/**
 * Класс вычисляет площадь прямоугольника по известному периметру и разнице его сторон.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class SqArea {

    /**
     * Метод вычисляет пролащадь приямоугольника.
     * @param p периметр.
     * @param k коэффициент, во сколько длина больше высоты.
     * @return площадь прямоугольника.
     */
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
