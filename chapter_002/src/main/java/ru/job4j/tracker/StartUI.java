package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Класс создан, для тестирования работы Трекера, имитирую пользовательский ввод через консоль.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class StartUI {

    /**
     * Метод реализует работу с меню трекера.
     * @param input объект интрефейса.
     * @param tracker объект трекера.
     */
    private final Input input;
    private final Tracker tracker;
    final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Меню трекера.
     */
    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (UserAction i : actions) {
            System.out.println(i.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(7);
        actions.add(new CreateAction(0, "Add new item", System.out::println));
        actions.add(new ReplaceAction(1, "Edit item", System.out::println));
        actions.add(new DeleteAction(2, "Delete item", System.out::println));
        actions.add(new FindAllItemAction(3, "Show all items", System.out::println));
        actions.add(new FindByIdItemAction(4, "Find item by id", System.out::println));
        actions.add(new FindByNameItemAction(5, "Find items by name", System.out::println));
        actions.add(new ExitAction(6, "Exit from the program.", System.out::println));
        new StartUI(validate, tracker, System.out::println).init(actions);
    }
}
