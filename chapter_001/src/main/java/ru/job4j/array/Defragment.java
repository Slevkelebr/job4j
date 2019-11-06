package ru.job4j.array;

/**
 * Класс перемещяет заполненные ячеейки массива в начало, а пустые в конец.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Defragment {
    /**
     * Метод получает массив строк и перемещяет пустые элементы в конец массива, а заполненные в начало.
     * @param array входящий массив строк.
     * @return дефрагментированный массив.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index + 1;
                while (i < array.length && array[i] == null) {
                    i++;
                }
                if (i < array.length) {
                    array[index] = array[i];
                    array[i] = null;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}