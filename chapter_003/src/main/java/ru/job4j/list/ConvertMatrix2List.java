package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertMatrix2List {
    public List<Integer> toList(Integer[][] array) {
 /*       List<Integer> list = new ArrayList<>();
        for (int[] arr : array) {
            for (int tmp : arr) {
                list.add(tmp);
            }
        }*/
        return Stream.of(array).flatMap(x -> Stream.of(x)).collect(Collectors.toList());
    }
}