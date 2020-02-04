package ru.job4j.tracker;

import java.util.function.Consumer;

public class ReplaceAction extends BaseAction {

    protected ReplaceAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.accept("=== You can edit an item ===");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        item.setId(id);
        boolean answer = tracker.replace(id, item);
        if (answer) {
            output.accept("Item changed");
        } else {
            output.accept("Invalid id specified");
        }
        return true;
    }
}
