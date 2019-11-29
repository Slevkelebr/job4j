package ru.job4j.tracker;

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
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Меню трекера.
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(0, "Add new item"), new ReplaceAction(1, "Edit item"), new DeleteAction(2, "Delete item"), new FindAllItemAction(3, "Show all items"), new FindByIdItemAction(4, "Find item by id"), new FindByNameItemAction(5, "Find items by name"), new ExitAction(6, "Exit from the program.")};
        new StartUI().init(validate, tracker, actions);
    }
}
