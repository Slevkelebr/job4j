package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int row = 0;
        for (; row < array.length; row++) {
            int cell = 0;
            for (; cell < array.length; cell++) {
                list.add(array[row][cell]);
            }
        }
        return list;
    }
}