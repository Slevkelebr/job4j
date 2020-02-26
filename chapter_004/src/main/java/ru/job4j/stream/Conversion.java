package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Conversion {
    public List<Integer> matrixNumbersToLostNum(Integer[][] numbers) {
        return Stream.of(numbers).flatMap(
                Stream::of).collect(Collectors.toList());
    }
}
