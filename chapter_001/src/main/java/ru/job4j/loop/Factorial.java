package ru.job4j.loop;

/**
 * Класс считает факториал числа.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Factorial {

    /**
     * Метод вычисляет факториал положительного целого числа n.
     * @param n положительное число.
     * @return факториал числа.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
              result *= i;
            }
        return result;
    }
}
