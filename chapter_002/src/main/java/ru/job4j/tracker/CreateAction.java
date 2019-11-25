package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Add new item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        Item answer = tracker.add(item);
        System.out.println("Item successfully added: " + answer.getName());
        return true;
    }
}
