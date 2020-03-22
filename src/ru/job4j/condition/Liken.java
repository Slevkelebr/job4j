package ru.job4j.condition;

/**
 * class Liken - работа операторов сравнения.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 22.03.2020
 */
public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);
        result = first < second;
        System.out.println(result);
        result = first == second;
        System.out.println(result);
    }
}
