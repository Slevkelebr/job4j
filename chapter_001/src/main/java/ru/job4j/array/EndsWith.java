package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int k = 0;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - i - 1] == word[word.length - i - 1]) {
                k++;
            }
            if (k == post.length) {
                result = true;
            }
        }
        return result;
    }
}