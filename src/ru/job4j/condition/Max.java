package ru.job4j.condition;

/**
 * class Max - наибольшее число из двух, трех и четверых чисел.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.2
 * @since 23.03.2020
 */
public class Max {

    /**
     * Вычисляет максимум из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return максимальное число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Перегруженный метод max для вычисления максимального числа из трёх.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимальное число.
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * Перегруженный метод max для вычисления максимального числа из четырех.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @param four четвертое число.
     * @return максимальное число.
     */
    public int max(int first, int second, int third, int four) {
        return max(first, max(second, third, four));
    }
}
