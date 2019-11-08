package ru.job4j.array;

/**
 * Класс проверяет, что слово заканчивается с определенный последовательностью.
 * Иммитирует метод endsWith в классе String.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class EndsWith {
    /**
     * Метод получает массив для поверки и массив с помощбю которого будет проходить проверка.
     * @param word массив который нужно проверить.
     * @param post массив с помощью которого проверяют.
     * @return массив удовлетворяет критерию проверки.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - i - 1] == word[word.length - i - 1]) {
                counter++;
            }
            if (counter == post.length) {
                result = true;
            }
        }
        return result;
    }
}