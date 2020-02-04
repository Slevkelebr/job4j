package ru.job4j.tracker;

import java.util.function.Consumer;

public class FindByIdItemAction extends BaseAction {

    protected FindByIdItemAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item items = tracker.findById(id);
        output.accept(String.format("Item changed: %s", items.getName()));
        return true;
    }
}
