package ru.job4j.calculator;

/**
 * class MathFunc - подсчет функций.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 21.03.2020
 */
public class MathFunc {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}
