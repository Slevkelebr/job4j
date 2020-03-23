package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To3Then3() {
        Max maximum = new Max();
        int result = maximum.max(5, 2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax1To4Then3() {
        Max maximum = new Max();
        int result = maximum.max(2, 2, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To4NumberEqual() {
        Max maximum = new Max();
        int result = maximum.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}