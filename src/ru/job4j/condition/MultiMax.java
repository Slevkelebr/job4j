package ru.job4j.condition;

/**
 * class MultiMax - максимум из трех чисел.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 23.03.2020
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
}
