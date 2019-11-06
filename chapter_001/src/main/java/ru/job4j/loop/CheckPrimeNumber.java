package ru.job4j.loop;

/**
 * Класс проверяет является ли число простым.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class CheckPrimeNumber {

    /**
     * Метод получает число и проверяет его является ли оно простым.
     * @param num число которое нужно проверить.
     * @return число простое или нет.
     */
    public boolean check(int num) {
        boolean prime = false;
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter <= 2) {
            prime = true;
        }
        return prime;
    }
}
