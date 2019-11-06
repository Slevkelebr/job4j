package ru.job4j.array;

/**
 * Класс создает и заполняет массив степенями чисел от 1 до N.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class Square {
    /**
     * Метод создает массив и заполняет его степенями чисел от 1 до bound.
     * @param bound значение N для создания массива длинной N.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int y = 1;
        for (int i = 0; i != bound; i++) {
            if (y <= bound) {
                rst[i] = y * y;
                y++;
            }
        }
        return rst;
    }
}
