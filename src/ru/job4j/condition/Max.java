package ru.job4j.condition;

/**
 * class Max - наибольшее число из двух.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 22.03.2020
 */
public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
