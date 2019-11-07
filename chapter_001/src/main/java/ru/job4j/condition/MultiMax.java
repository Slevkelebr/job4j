package ru.job4j.condition;

/**
 * Класс вычисляет максимальное число из трёх.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class MultiMax {

    /**
     * Метод возвращает максимум из трёх чисел.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимальное из трёх.
     */
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return  result > third ? result : third;
    }
}
