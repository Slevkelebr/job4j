package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManWeight() {
        double in = 172;
        double expected = 82.8;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 160;
        double expected = 57.49;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }
}