package ru.job4j.tracker;

import java.util.function.Consumer;

public class ExitAction extends BaseAction {
    protected ExitAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
