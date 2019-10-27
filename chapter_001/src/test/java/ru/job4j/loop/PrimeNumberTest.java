package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
   @Test
   public void when5Number3Prime() {
       PrimeNumber primeNumber = new PrimeNumber();
       int expected = 3;
       int out = primeNumber.calc(5);
       assertThat(out, is(expected));
   }

    @Test
    public void when9Number4Prime() {
        PrimeNumber primeNumber = new PrimeNumber();
        int expected = 4;
        int out = primeNumber.calc(9);
        assertThat(out, is(expected));
    }
}
