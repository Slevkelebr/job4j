package ru.job4j.tracker;

import java.util.function.Consumer;

public class CreateAction extends BaseAction {

    protected CreateAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.accept("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        Item answer = tracker.add(item);
        output.accept(String.format("Item successfully added: %s", answer.getName()));
        return true;
    }
}
