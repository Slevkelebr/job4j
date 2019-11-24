package ru.job4j.tracker;

public class FindAllItemAction implements UserAction {

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Currently there are the following items: ");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.print(item.getName() + " ");
            System.out.println(item.getId());
        }
        return true;
    }
}
