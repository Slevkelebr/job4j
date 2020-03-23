package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.distance.Point;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(3, 5);
        Point second = new Point(2, 1);
        double result = first.distance(second);
        double expected = 4.12;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void distance3D() {
        Point first = new Point(3, 5, 3);
        Point second = new Point(2, 1, 1);
        double result = first.distance3D(second);
        double expected = 4.58;
        Assert.assertEquals(expected, result, 0.01);
    }
}