package ru.job4j.tracker;

public class FindByNameItemAction implements UserAction {

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.print(item.getName() + " ");
            System.out.println(item.getId());
        }
        return true;
    }
}
