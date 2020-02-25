package ru.job4j.stream.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = students.stream().filter(predicate).
                collect(Collectors.toList());
        return result;
    }
}
