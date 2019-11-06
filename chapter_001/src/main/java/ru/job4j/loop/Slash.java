package ru.job4j.loop;

/**
 * Класс рисует крест в консоле.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Slash {

    /**
     * Метод по заданному размеру рисует крест в консоле.
     * @param size размер креста.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row + cell == size - 1 | row + cell == (size - 1) * 2;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод является точкой входа в программу и выводит на консоль кресты заданного размера.
     * @param args массив строк.
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}