package ru.job4j.tracker;

/**
 * Интерфейс определяет работу класса по получению данных от пользователя в консоли.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public interface Input {
    String askStr(String question);

    int askInt(String question);

    int askInt(String question, int max);
}
