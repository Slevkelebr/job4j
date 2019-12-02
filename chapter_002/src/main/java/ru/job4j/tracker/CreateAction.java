package ru.job4j.tracker;

public class CreateAction extends BaseAction {

    protected CreateAction(int key, String name) {
        super(key, name);
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
