package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int j = 0;
        int k = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[j] == data[i]) {
                k++;
            }
            if (k == data.length - 1) {
                result = true;
            }
        }
        return result;
    }
}