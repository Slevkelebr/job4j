package ru.job4j.array;

/**
 * Класс Check проверят все элементы в массиве являются true или false.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Check {
    /**
     * Метод проверяет заполнен ли массив true или false.
     * @param data массив заполенный true и false.
     * @return являются ли все элементы true или false.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int j = 0;
        int k = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[j] == data[i]) {
                k++;
            }
            if (k == data.length - 1) {
                result = true;
            }
        }
        return result;
    }
}