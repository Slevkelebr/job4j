package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindByNameItemAction extends BaseAction {

    protected FindByNameItemAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            output.accept(String.format("Name: %s | Id: %s", item.getName(), item.getId()));
        }
        return true;
    }
}
