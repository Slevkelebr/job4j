package ru.job4j.condition;

/**
 * Класс вычисляет максимальное число из двух.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Max {

    /**
     * Метод сравнивает два числа и возвращает максимальное из них.
     * @param left первое число.
     * @param right второе число.
     * @return максимальное из двух.
     */
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int three) {
        return max(first, max(second, third, three));
    }
}
