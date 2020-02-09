package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStudents {

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Student::compareTo)
                .takeWhile(sc -> sc.getScope() > bound)
                .collect(Collectors.toList());
    }
}
