package ru.job4j.array;

/**
 * Класс создает двумерный массив заданного размера и заполняет его произведениями индексов.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Matrix {
    /**
     * Метод создает двумерный массив заполненный произведениями индексов.
     * @param size размер двумерного массива.
     * @return двумерный массив заполненный произведениями индексов.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
