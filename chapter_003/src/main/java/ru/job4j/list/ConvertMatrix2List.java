package ru.job4j.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
 /*       List<Integer> list = new ArrayList<>();
        for (int[] arr : array) {
            for (int tmp : arr) {
                list.add(tmp);
            }
        }*/
        return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).boxed().collect(Collectors.toList());
                //Stream.of(array).flatMap(x -> Stream.of(x)).collect(Collectors.toList());
    }
}