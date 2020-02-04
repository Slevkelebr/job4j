package ru.job4j.tracker;

import java.util.function.Consumer;

/**
 * Класс создан для тестирования загрузки действий и проверки, что тест пройдет для метода init в StartUi.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 24.11.2019
 */
public class StubAction extends BaseAction {
    /**
     * Проверям выбрали ли пункт меню или нет.
     */
    private boolean call = false;

    protected StubAction(int key, String name, Consumer<String> output) {
        super(key, name, output);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
