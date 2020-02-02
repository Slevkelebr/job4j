package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Calc function = new Calc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        Calc function = new Calc();
        List<Double> result = function.diapason(9, 10, x -> Math.sqrt(x) + 3);
        List<Double> expected = Arrays.asList(6D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunction() {
        Calc function = new Calc();
        List<Double> result = function.diapason(5, 8, Math::log);
        List<Double> expected = Arrays.asList(Math.log(5d), Math.log(6d), Math.log(7d));
        assertThat(result, is(expected));
    }

}