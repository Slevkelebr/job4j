package ru.job4j.array;

public class ArrayChar {
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
