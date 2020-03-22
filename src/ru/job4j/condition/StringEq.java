package ru.job4j.condition;

/**
 * class StringEq - Операторы сравнения в String.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 22.03.2020
 */
public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        return root.equals(login);
    }
    public static void main(String[] args) {
        String your = "your name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);

    }
}
