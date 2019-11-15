package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenYouNeedToDeleteCellInArray() {
        Tracker tracker = new Tracker();
        // Создаём заявки.
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        // Добавляем в трекер инициализирую id.
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        // Удаляем завку.
        tracker.delete(second.getId());
        Item[] expected = new Item[] {first, third};
        // Проверяем, что заявки нет.
       assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        // Создаём заявки.
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        // Добавляем в трекер инициализирую id.
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findAll(), is(new Item[]{first, second, third}));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        // Создаём заявки.
        Item first = new Item("test1");
        Item second = new Item("test");
        Item third = new Item("test");
        // Добавляем в трекер инициализирую id.
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findByName(second.getName()), is(new Item[]{second, third}));
    }

    @Test
    public void findByIdTest() {
        Tracker tracker = new Tracker();
        // Создаём заявки.
        Item first = new Item("test1");
        Item second = new Item("test");
        Item third = new Item("test");
        // Добавляем в трекер инициализирую id.
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        String out = second.getId();
        assertThat(tracker.findById(out), is(second));
    }
}