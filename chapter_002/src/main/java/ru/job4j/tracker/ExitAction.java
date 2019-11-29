package ru.job4j.tracker;

public class ExitAction extends BaseAction {
    protected ExitAction(int key, String name) {
        super(key, name);
    }

    /*@Override
    public String name() {
        return "Exit from the program.";
    }*/

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
