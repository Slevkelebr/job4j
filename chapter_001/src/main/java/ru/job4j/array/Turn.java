package ru.job4j.array;

/**
 * Класс переворачивает задом наперёд полученный массив элементов.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Turn {
    /**
     * Метод переворачивает полученный массив элементов задом наперёд.
     * @param array массив элементов.
     * @return перевернутый массив задом наперёд.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length - i; i++) {
            if (i != array.length - i - 1) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
        return array;
    }
}
