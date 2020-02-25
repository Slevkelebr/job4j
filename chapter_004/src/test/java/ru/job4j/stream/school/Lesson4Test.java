package ru.job4j.stream.school;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Lesson4Test {

    @Test
    public void whenListToMap() {
        Lesson4 lesson = new Lesson4();
        List<Student> students = Arrays.asList(
                new Student(10, "Petr"),
                new Student(15, "Serge")
        );
        Map<String, Student> result = lesson.listToMap(students);
        Set<String> expected = Set.copyOf(Arrays.asList("Petr", "Serge"));
        assertThat(result.keySet(), is(expected));
    }
}