package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenRubleToEuro() {
        int in = 270;
        int expected = 3;
        int result = Converter.rubleToEuro(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenRubleToDollar() {
        int in = 800;
        int expected = 10;
        int result = Converter.rubleToDollar(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEuroToRuble() {
        int in = 5;
        int expected = 450;
        int result = Converter.euroToRuble(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenDollarToRuble() {
        int in = 5;
        int expected = 400;
        int result = Converter.dollarToRuble(in);
        Assert.assertEquals(result, expected);
    }
}