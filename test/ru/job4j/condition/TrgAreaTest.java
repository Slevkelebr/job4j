package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.distance.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void period() {
        Point first = new Point(1, 2);
        Point second = new Point(0, 1);
        Point third = new Point(0, 5);
        TrgArea triangle = new TrgArea(first, second, third);
        double result = triangle.period(
                first.distance(second),
                first.distance(third),
                second.distance(third));
        double expected = 4.28;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void area() {
        Point first = new Point(1, 2);
        Point second = new Point(0, 1);
        Point third = new Point(0, 5);
        TrgArea triangle = new TrgArea(first, second, third);
        double result = triangle.area();
        double expected = 1.99;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenExist() {
        Point first = new Point(1, 2);
        Point second = new Point(0, 1);
        Point third = new Point(0, 5);
        TrgArea triangle = new TrgArea(first, second, third);
        boolean result = triangle.exist(
                first.distance(second),
                first.distance(third),
                second.distance(third));
        assertThat(result, is(true));
    }

    @Test
    public void whenFalse() {
        Point first = new Point(1, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        TrgArea triangle = new TrgArea(first, second, third);
        boolean result = triangle.exist(
                first.distance(second),
                first.distance(third),
                second.distance(third));
        assertThat(result, is(false));
    }
}