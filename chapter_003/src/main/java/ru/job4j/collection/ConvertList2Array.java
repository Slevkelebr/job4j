package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] i : list) {
            for (int tmp : i) {
                result.add(tmp);
            }
        }
        return result;
    }

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        System.out.println(groups);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (row < cells && cell < cells) {
                array[row][cell] = num;
                cell++;
            } else {
                cell = 0;
                row++;
                array[row][cell] = num;
                cell++;
            }
        }
        return array;
    }
}