package ru.job4j.array;

/**
 * Класс сортирует входящий массив элементов по возрастанию и убыванию.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class SortSelected {
    /**
     * Метод сортирует входящий массив по возрастанию или убыванию.
     * @param data входящий массив элементов.
     * @return отсортированный массив.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
