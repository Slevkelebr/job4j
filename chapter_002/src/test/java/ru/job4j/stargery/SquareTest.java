package ru.job4j.stargery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                                    .append("++++" + System.lineSeparator())
                                    .append("+  +" + System.lineSeparator())
                                    .append("+  +" + System.lineSeparator())
                                    .append("++++" + System.lineSeparator())
                                    .toString()
                                    )
        );
    }
}
