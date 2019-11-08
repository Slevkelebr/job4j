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
        for (int out = 0; out < size; out++) {
            for (int in = 0; in < size; in++) {
                table[out][in] = (out + 1) * (in + 1);
            }
        }
        return table;
    }
}
