package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GroupTest {

    @Test
    public void whenStudentsToSections() {
        List<Student> students = Arrays.asList(
                new Student("Boris", Set.of("Matematic", "Lesten")),
                new Student("Petr", Set.of("Listen", "Ruby")),
                new Student("Serge", Set.of("Ruby", "Matematic"))
        );
        Map<String, Set<String>> result = Group.sections(students);
        Set<String> expected = Set.of("Matematic", "Lesten", "Ruby");
        assertTrue(result.keySet().containsAll(expected));
    }
}