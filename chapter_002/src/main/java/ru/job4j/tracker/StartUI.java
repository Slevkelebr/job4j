package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.println("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("Currently there are the following items: ");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i].getName() + " ");
                    System.out.println(items[i].getId());
                }
            } else if (select == 2) {
                System.out.println("=== You can edit an item ===");
                System.out.println("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                System.out.println("Enter id: ");
                String id = input.askStr("");
                boolean answer = tracker.replace(id, item);
                System.out.println("Item changed: " + answer);
            } else if (select == 3) {
                System.out.println("Enter id: ");
                String id = input.askStr("");
                boolean answer = tracker.delete(id);
                System.out.println("Item deleted: " + answer);
            } else if (select == 4) {
                System.out.println("Enter id: ");
                String id = input.askStr("");
                Item items = tracker.findById(id);
                System.out.print("Item changed: ");
                System.out.println(items.getName());
            } else if (select == 5) {
                System.out.println("Enter name: ");
                String name = input.askStr("");
                Item[] items = tracker.findByName(name);
                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i].getName() + " ");
                    System.out.println(items[i].getId());
                }
            } else if (select == 6) {
                System.out.println("Program completion");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }


}
