package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindAllItemAction extends BaseAction {

    protected FindAllItemAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.accept("Currently there are the following items: ");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            output.accept(String.format("Name: %s | Id: %s", item.getName(), item.getId()));
        }
        return true;
    }
}
