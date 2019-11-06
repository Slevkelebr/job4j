package ru.job4j.loop;

/**
 * Класс строит шахматную доску в псевдографике..
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Board {

    /**
     * Метод выводит в консоль шахматную доску в псевдографике.
     * @param width ширина доски.
     * @param height высота доски.
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Метод выводит в консоль построенные шахматные доски.
     * @param args массив строк.
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}
