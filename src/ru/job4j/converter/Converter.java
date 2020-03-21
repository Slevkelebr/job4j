package ru.job4j.converter;

/**
 * class Converter - конвертор валюты.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 21.03.2020
 */
public class Converter {

    public static int rubleToEuro(int value) {
        return value / 90;
    }

    public static int rubleToDollar(int value) {
        return value / 80;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(270);
        System.out.println("270 rubles are " + euro + " euros.");
    }
}
