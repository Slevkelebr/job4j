package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StartUITest {

/*    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction(0, "Exit");
        List<UserAction> list = new ArrayList<>();
        list.add(action);
        new StartUI(input, new Tracker(), System.out::println).init(list);
        assertThat(action.isCall(), is(true));
    }*/

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        List<UserAction> action = new ArrayList<>();
        action.add(new StubAction(0, "Stub action", System.out::println));
        StubInput input = new StubInput(new String[] {"0"});
        new StartUI(input, new Tracker(), System.out::println).init(action);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
