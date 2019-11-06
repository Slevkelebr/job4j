package ru.job4j.converter;

/**
 * Класс конвертирует волюту rub, euro, dollar.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Converter {

    /**
     * Метод конвертирует рубли в евро.
     * @param value количество рублей.
     * @return количество евро.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Метод конвертирует рубли в доллары.
     * @param value количество рублей.
     * @return количество долларов.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Метод конвертирует евро в рубли.
     * @param value количество евро.
     * @return количество рублей.
     */
    public static int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Метод конвертирует доллары в рубли.
     * @param value количество долларов.
     * @return колличество рублей.
     */
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    /**
     * Метод выводи в консоль результаты конвертирования валюты.
     * @param args массив строк.
     */
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
        int euroRuble = euroToRuble(11);
        System.out.println("11 euro are " + euroRuble + " ruble.");
        int dollarRuble = dollarToRuble(21);
        System.out.println("21 dollar are " + dollarRuble + " ruble");
    }
}
