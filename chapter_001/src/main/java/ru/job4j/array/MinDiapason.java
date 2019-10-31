package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for ( ; start < finish; start++) {
            if (min > array[start]) {
                min = array[start];
            }
        }
        return min;
    }
}
