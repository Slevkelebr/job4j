package ru.job4j.condition;

/**
 * Класс имитирует ответы бота на запрограммированные фразы.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class DummyBot {

    /**
     * Метод примает сроку и сравнивает её с запрограммированной строкой и отвечает, в зависимости совпадет или нет строка.
     * @param question строка для бота, на которую он должен ответить.
     * @return ответ бота.
     */
    public static String answer(String question) {
        String answer = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
                answer = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            answer = "До скорой встречи.";
        }
        return answer;
    }
}