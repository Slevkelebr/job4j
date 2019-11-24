package ru.job4j.tracker;

public class FindByIdItemAction implements UserAction {

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item items = tracker.findById(id);
        System.out.print("Item changed: ");
        System.out.println(items.getName());
        return true;
    }
}
