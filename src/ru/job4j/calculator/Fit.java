package ru.job4j.calculator;

/**
 * class Fit - расчет идеального веса.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 21.03.2020
 */
public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(172);
        System.out.println("Man 172 is " + man);
        System.out.println("Women 160 is " + Fit.womanWeight(160));
    }
}
