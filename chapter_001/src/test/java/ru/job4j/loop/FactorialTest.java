package ru.job4j.loop;

import org.junit.Test;
import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int n = 5;
        int expected = 120;
        int out = factorial.calc(n);
        assertThat(out, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
