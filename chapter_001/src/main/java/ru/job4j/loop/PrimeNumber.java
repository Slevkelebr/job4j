package ru.job4j.loop;

/**
 * Класс считает количество простых чисел от 1 до заданного диапазона.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class PrimeNumber {

    /**
     * Метод считает количество простых чисел в заданном диапазоне.
     * @param finish конечное значение диапазона.
     * @return количество простых чисел.
     */
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
            if (checkPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
