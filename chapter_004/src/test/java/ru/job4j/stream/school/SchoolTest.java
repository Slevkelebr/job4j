package ru.job4j.stream.school;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void whenStudentScopeMore70() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(65, "petr"),
                new Student(75, "petr"),
                new Student(80, "petr")
        );
        List<Student> result = school.collect(students,
                student -> student.getScore() > 70 & student.getScore() < 100);
        List<Student> expected = Arrays.asList(
                new Student(75, "petr"),
                new Student(80, "petr")
        );
        assertThat(result.size(), is(2));
    }

    @Test
    public void whenStudentScopeMore50Less70() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(65, "petr"),
                new Student(75, "petr"),
                new Student(80, "petr")
        );
        List<Student> result = school.collect(students,
                student -> student.getScore() > 50 & student.getScore() < 70);
        List<Student> expected = Arrays.asList(new Student(65, "petr"));
        assertThat(result.size(), is(1));
    }

    @Test
    public void whenStudentScopeMore0Less50() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(65, "petr"),
                new Student(75, "petr"),
                new Student(80, "petr")
        );
        List<Student> result = school.collect(students,
                student -> student.getScore() > 0 & student.getScore() < 50);
        List<Student> expected = new ArrayList<>();
        assertThat(result.size(), is(0));
    }
}