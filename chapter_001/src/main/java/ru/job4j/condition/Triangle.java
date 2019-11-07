package ru.job4j.condition;

/**
 * Класс проверят может ли сущестовать треугольник по заданным сторонам.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Triangle {

    /**
     * Метод проверяет, что сумма любых двух сторон больше третий.
     * @param ab первая сторона.
     * @param ac вторая сторона.
     * @param bc третья сторона.
     * @return может ли сущестововать треугольник, true или false.
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ab + bc > ac && ac + bc > ac);
    }
}
