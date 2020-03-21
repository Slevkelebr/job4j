package ru.job4j.converter;

/**
 * class Converter - конвертор валюты.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 21.03.2020
 */
public class Converter {

    /**
     * конвертирует рубли в евро.
     * @param value рубли.
     * @return евро.
     */
    public static int rubleToEuro(int value) {
        return value / 90;
    }

    /**
     * конвертирует рубли в доллары.
     * @param value рубли.
     * @return доллары.
     */
    public static int rubleToDollar(int value) {
        return value / 80;
    }

    /**
     * ковертирует евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public static int euroToRuble(int value) {
        return value * 90;
    }

    /**
     * конвертирует доллары в рубли.
     * @param value доллары
     * @return рубли
     */
    public static int dollarToRuble(int value) {
        return value * 80;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(270);
        System.out.println("270 rubles are " + euro + " euros.");
    }
}
