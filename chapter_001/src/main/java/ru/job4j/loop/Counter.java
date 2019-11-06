package ru.job4j.loop;

/**
 * Класс считает сумму чётных чисел в заданном диапазоне.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Counter {

    /**
     * Метод считает сумму чётных чисел в диапазоне.
     * @param start начало диапазона.
     * @param finish конец диапазона.
     * @return сумма чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for ( ; start <= finish; start++) {
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }
}
