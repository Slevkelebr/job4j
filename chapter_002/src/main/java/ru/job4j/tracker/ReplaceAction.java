package ru.job4j.tracker;

public class ReplaceAction extends BaseAction {

    protected ReplaceAction(int key, String name) {
        super(key, name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== You can edit an item ===");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        item.setId(id);
        boolean answer = tracker.replace(id, item);
        if (answer) {
            System.out.println("Item changed");
        } else {
            System.out.println("Invalid id specified");
        }
        return true;
    }
}
