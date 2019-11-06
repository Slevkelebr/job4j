package ru.job4j.loop;

/**
 * Класс считает сколько месяце нужно тренироваться что бы обогнать соперника по тяге.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Fitness {

    /**
     * Метод вычисляет сколько месяцев нужно тренироваться что бы обогать соперника.
     * @param ivan вес тяги.
     * @param nik вес тяги.
     * @return количество месяцев.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
