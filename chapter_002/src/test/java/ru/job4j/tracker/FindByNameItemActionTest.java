package ru.job4j.tracker;

        import org.junit.Test;

        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import java.util.StringJoiner;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.*;

public class FindByNameItemActionTest {

    @Test
    public void whenNameTask() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("Task1");
        tracker.add(item);
        FindByNameItemAction act = new FindByNameItemAction(3, "Show all items");
        act.execute(new StubInput(new String[] {"Task1"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName() + " " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}