package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteAction extends BaseAction {

    protected DeleteAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean answer = tracker.delete(id);
        if (answer) {
            output.accept("Item removed");
        } else {
            output.accept("Invalid id specified");
        }
        return true;
    }
}
