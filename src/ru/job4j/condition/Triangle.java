package ru.job4j.condition;

/**
 * class Triangle - существует ли треугольник.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 23.03.2020
 */
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            result = true;
        }
        return result;
    }
}
