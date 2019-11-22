package ru.job4j.tracker;

/**
 * Класс создан, для тестирования работы Трекера, имитирую пользовательский ввод через консоль.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class StubInput implements Input {
    /**
     * Массив вариантов ответов пользователя.
     */
    private String[] answer;
    /**
     * Счетчик для прохождению по массиву ответов.
     */
    private int position = 0;

    public StubInput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String askStr(String question) {
        return answer[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
