package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenSquare1() {
        int p = 4;
        int k = 1;
        double result = SqArea.square(p, k);
        double expected = 1;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenSquare2() {
        int p = 6;
        int k = 2;
        double result = SqArea.square(p, k);
        double expected = 2;
        Assert.assertEquals(expected, result, 0.01);
    }
}