package ru.job4j.condition;

/**
 * Класс вычисляет максимальное число из четырёх.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class SqMax {

    /**
     * Метод возвращает максимальное число из четырёх.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @param forth четвёртое число.
     * @return максимальное из четырёх.
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second & first > third & first > forth) {
            result = first;
        } else if (second > third & second > forth) {
            result = second;
            } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
