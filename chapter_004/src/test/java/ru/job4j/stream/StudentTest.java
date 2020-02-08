package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class StudentTest {

    @Test
    public void thenBoundMore4() {
        CheckStudents check = new CheckStudents();
        Student sergey = new Student("Sergey", 5);
        Student petr = new Student("Petr", 3);
        List<Student> students = Arrays.asList(sergey, null, petr, null);
        List<Student> result = check.levelOf(students, 4);
        List<Student> expected = Collections.singletonList(sergey);
        Assert.assertThat(result, is(expected));
    }

}