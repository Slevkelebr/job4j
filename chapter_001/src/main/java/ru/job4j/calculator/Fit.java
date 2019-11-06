package ru.job4j.calculator;

/**
 * Класс вычисыле иделаьный вес для мужчины и женщины.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Fit {
    /**
     * Метод вычисляет идеальный вес для мужчины.
     * @param height рост.
     * @return идеальный вес.
     */

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Метод вычисляет идеальный вес для женщины.
     * @param height рост.
     * @return идеальный вес.
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(172);
        System.out.println("Man 172 is " + man);
        double women = womanWeight(162);
        System.out.println("Women 162 is " + women);
    }
}
