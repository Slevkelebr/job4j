package ru.job4j.array;

/**
 * Класс проверяет, что слово начинается с определенной последовательностью.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class ArrayChar {
    /**
     * Проверка слова на последовательность символов.
     * @param word массив символов который нужно проверить.
     * @param pref проверочный массив для определения искомого слова.
     * @return искомое слово нашлось, либо нет.
     */
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = false;
        int k = 0;
        int i = 0;
        for ( ; i < pref.length; i++) {
            if (word[i] == pref[i]) {
                k++;
            } else {
                result = false;
            }

            if (k == pref.length) {
                result = true;
            }
        }
        return result;
    }
}
