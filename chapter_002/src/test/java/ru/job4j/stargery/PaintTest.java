package ru.job4j.stargery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 22.11.2019
 * @version 2.0
 */
public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("++++" + System.lineSeparator())
                                .append("+  +" + System.lineSeparator())
                                .append("+  +" + System.lineSeparator())
                                .append("++++" + System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder()
                                .append("   +   " + System.lineSeparator())
                                .append("  + +  " + System.lineSeparator())
                                .append(" +   + " + System.lineSeparator())
                                .append("+++++++" + System.lineSeparator())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
}