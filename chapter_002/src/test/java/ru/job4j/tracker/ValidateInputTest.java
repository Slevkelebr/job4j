package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInputNfe() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.askInt("Enter", 6);
        assertThat(
                mem.toString(),
                is("Please enter validate data again.")
        );
        System.setOut(out);
    }

    @Test
    public void whenInvalidInputKey() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"8", "1"})
        );
        input.askInt("Enter", 6);
        assertThat(
                mem.toString(),
                is("Please select key from menu ")
        );
        System.setOut(out);
    }
}