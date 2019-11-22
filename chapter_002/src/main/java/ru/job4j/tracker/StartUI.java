package ru.job4j.tracker;

/**
 * Класс создан, для тестирования работы Трекера, имитирую пользовательский ввод через консоль.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class StartUI {

    /**
     * Метод запрашивает у пользователя имя задачи и добавляет её в трекер.
     * @param input объект интерфейса.
     * @param tracker объект трекера.
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * Метод редактирует Item в трекере ищя его по id.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== You can edit an item ===");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        item.setId(id);
        boolean answer = tracker.replace(id, item);
        System.out.println("Item changed: " + answer);
    }

    /**
     * Метод запрашивает у пользователя id заявки, что бы её удалить.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean answer = tracker.delete(id);
        System.out.println("Item deleted: " + answer);
    }

    /**
     * Метод запрашивает выводит в консоль все заявки из трекера.
     * @param tracker объект трекера.
     */
    public static void findAllItem(Tracker tracker) {
        System.out.println("Currently there are the following items: ");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName() + " ");
            System.out.println(items[i].getId());
        }
    }

    /**
     * Метод запрашивает у пользователя id заявки, и выводит её на экран.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    public static void findByIdItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item items = tracker.findById(id);
        System.out.print("Item changed: ");
        System.out.println(items.getName());
    }

    /**
     * Метод по имени заявки выводит все совпадения из трекера.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    public static void findByNameItem(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName() + " ");
            System.out.println(items[i].getId());
        }
    }

    /**
     * Метод реализует работу с меню трекера.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(tracker);
            } else if (select == 2) {
               StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                System.out.println("Program completion");
                run = false;
            }
        }
    }

    /**
     * Меню трекера.
     */
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
