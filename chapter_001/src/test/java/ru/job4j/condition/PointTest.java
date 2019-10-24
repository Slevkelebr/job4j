package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance(){
        //int x1, y1, x2, y2;
        double expected = 9.0;
        double out = Point.distance(2,3,5,6);
        Assert.assertEquals(expected, out, 0.01);
    }
}
