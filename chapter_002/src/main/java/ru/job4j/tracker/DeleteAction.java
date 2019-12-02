package ru.job4j.tracker;

public class DeleteAction extends BaseAction {

    protected DeleteAction(int key, String name) {
        super(key, name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean answer = tracker.delete(id);
        if (answer) {
            System.out.println("Item removed");
        } else {
            System.out.println("Invalid id specified");
        }
        return true;
    }
}
