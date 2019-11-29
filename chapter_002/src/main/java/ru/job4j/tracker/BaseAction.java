package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {
    private final String name;
    private final int key;

    protected BaseAction(final  int key, final String name) {
        this.name = name;
        this.key = key;
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
