package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Класс создан, для тестирования работы Трекера, имитирую пользовательский ввод через консоль.
 * @author Sergey Frolov.(Slevkelebr107@gmail.com).
 * @since 11.2019
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище.
     * @param item новая заявка.
     * @return заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявка нет уникальности полей, имени и описание.
     * Для идентификации нам нужен уникальный ключ.
     * @return уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод редактирует заявку в хранилище.
     * @param id уникальный ключ.
     * @param item новая редакция заявки.
     * @return успешно ли прошло редактирование заявки.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        item.setId(id);
        int count = 0;
        for (Item i : items) {
            if (i.getId().equals(id)) {
               items.set(count, item);
                result = true;
                break;
            }
            count++;
        }
        return result;
    }

    /**
     * Метод удаляет заявку из хранилища по id.
     * @param id уникальный ключ.
     * @return успешно ли прошло удаление.
     */
    public boolean delete(String id) {
        boolean result = false;
        int count = 0;
        for (Item item : items) {
            if (item.getId().equals(id)) {
               items.remove(count);
                result = true;
                break;
            }
            count++;
        }
        return result;
    }

    /**
     * Метод возвращает копию массива без null.
     * @return копия массива.
     */
    public List<Item> findAll() {
        return items.subList(0, items.size());
    }

    /**
     * Метод проверяет элементы массива сравнивая их по ключевому слову и совпавшие элементы возвращает в массиве.
     * @param key ключевое слово.
     * @return массив с элементами совподающее с ключевым словом.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result.subList(0, result.size());
    }

    /**
     * Метод ищет элемент с необходимым id и возвращает искомый элемент.
     * @param id уникальный индекс.
     * @return элемент с уникальным индексом либо null если ничего не найдено.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}