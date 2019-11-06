package ru.job4j.array;

/**
 * Класс ищет минимальный элемент в массиве в заданном диапазоне.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class MinDiapason {
    /**
     *
     * @param array массив целочисленных элементов для поиска.
     * @param start начальное значение диапазона.
     * @param finish конечное значение диапазона.
     * @return минимальный элемент в диапазоне.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for ( ; start < finish; start++) {
            if (min > array[start]) {
                min = array[start];
            }
        }
        return min;
    }
}
