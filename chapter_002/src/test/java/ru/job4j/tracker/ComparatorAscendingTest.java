package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ComparatorAscendingTest {

    @Test
    public void compareNatural() {
        List<Item> items = new ArrayList<>();
        Item first = new Item("3Task");
        Item second = new Item("Task2");
        Item third = new Item("Task3");
        Item four = new Item("2Task");
        items.add(first);
        items.add(second);
        items.add(third);
        items.add(four);
        Item[] input = new Item[]{four, first, second, third};
        List<Item> expected = new ArrayList<>(Arrays.asList(input));
        items.sort(new ComparatorAscending());
        Assert.assertEquals(expected, items);
    }
}