package ru.job4j.tracker;

public class FindAllItemAction extends BaseAction {

    protected FindAllItemAction(int key, String name) {
        super(key, name);
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
