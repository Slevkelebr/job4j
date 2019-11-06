package ru.job4j.array;

/**
 * Класс ищет минимлаьное число в массиве.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Min {
    /**
     * Метод находи минимальный элемент в массиве.
     * @param array массив целочисленных элементов.
     * @return минимальный элемент.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index : array) {
            if (min > index) {
                min = index;
            }
        }
        return min;
    }
}
