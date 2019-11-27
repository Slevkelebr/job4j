package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс создан, для работы с пользователем через консоль.
 * Так же для разрыва строгой зависимости от класса Scanner через интерфейс Input.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class ConsoleInput implements Input {
    /**
     * конструктор для объекта типа Scanner, который имеет методы считывания потокового ввода в консоле.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод спрашивает у пользователя вопрос и ждет ввода в консоль.
     * @param question вопрос.
     * @return ответ строка.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Метод спрашивает у пользователя вопрос и дет ввода в консоль.
     * @param question вопрос.
     * @return ответ число.
     */
    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}