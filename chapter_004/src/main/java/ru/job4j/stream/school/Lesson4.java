package ru.job4j.stream.school;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson4 {
    public Map<String, Student> listToMap(List<Student> students) {
        return students.stream().distinct().collect(
                Collectors.toMap(
                        student -> student.getSurname(),
                        student -> student
                )
        );
    }
}
