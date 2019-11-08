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
        for (int counter = 0; counter < array.length - counter; counter++) {
            if (counter != array.length - counter - 1) {
                int temp = array[counter];
                array[counter] = array[array.length - counter - 1];
                array[array.length - counter - 1] = temp;
            }
        }
        return array;
    }
}
