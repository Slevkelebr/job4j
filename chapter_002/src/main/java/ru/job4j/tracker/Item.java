package ru.job4j.tracker;

/**
 * Класс Заявки с сеттерами геттерами к полям заявки.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
}