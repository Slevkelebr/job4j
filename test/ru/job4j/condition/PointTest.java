package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 3;
        int x2 = 2;
        int y1 = 5;
        int y2 = 1;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 4.12;
        Assert.assertEquals(expected, result, 0.01);
    }
}