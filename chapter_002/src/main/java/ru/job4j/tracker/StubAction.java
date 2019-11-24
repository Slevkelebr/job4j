package ru.job4j.tracker;

/**
 * Класс создан для тестирования загрузки действий и проверки, что тест пройдет для метода init в StartUi.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 24.11.2019
 */
public class StubAction implements UserAction {
    /**
     * Проверям выбрали ли пункт меню или нет.
     */
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
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
