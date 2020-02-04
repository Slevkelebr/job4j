package ru.job4j.tracker;

import java.util.function.Consumer;

public abstract class BaseAction implements UserAction {
    private final String name;
    private final int key;
    Consumer<String> output;

    protected BaseAction(final int key, final String name, Consumer<String> output) {
        this.name = name;
        this.key = key;
        this.output = output;
    }

    @Override
    public String name() {
        return String.format("%s. %s", this.key, this.name);
    }

    @Override
    public int key() {
        return this.key;
    }
}
