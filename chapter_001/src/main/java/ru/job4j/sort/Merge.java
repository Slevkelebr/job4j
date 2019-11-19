package ru.job4j.sort;

/**
 * Класс объединяет два отсортированных массива в третий отсортированный массив.
 * @author Slevkelebr.
 * @since 19.11.2019
 */

import java.util.Arrays;

public class Merge {

    /**
     * Метод сравнивает первые элементы двух массивов, наименьший записывает в результирующий массив.
     * Далее операция повторяется, но сравнене происходит уже с первым элементов и нулевым.
     * После того как в одном из массивов заканчиваются элементы, к результирующему массиву добавляется остаток от второго массива.
     * @param left первый отсортированный массив.
     * @param right второй отсортированный массив.
     * @return результирующийм массив.
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int length = indexLeft + indexRight;
        while (length < rsl.length) {
            if (indexLeft == left.length) {
                rsl[length++] = right[indexRight++];
            } else if (indexRight == right.length) {
                rsl[length++] = left[indexLeft++];
            } else if (left[indexLeft] < right[indexRight]) {
                rsl[length++] = left[indexLeft++];
            } else {
                rsl[length++] = right[indexRight++];
            }
        }
        return  rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(new int[] {1, 3, 5}, new int[] {2, 4});
        System.out.println(Arrays.toString(rsl));
    }
}
