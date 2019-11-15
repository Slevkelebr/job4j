package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

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
        this.items[this.position++] = item;
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
        int count = 0;
        boolean result = false;
        for (Item cell : items) {
            if (cell != null && cell.getId().equals(id)) {
                this.items[count] = item;
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
        int count = 0;
        boolean result = false;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                System.arraycopy(items, count + 1, this.items, count, items.length - count - 1);
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
    public Item[] findAll() {
        Item[] array = new Item[this.position];
        for (int count = 0; count != this.position; count++) {
            array[count] = this.items[count];
        }
        return array;
    }

    /**
     * Метод проверяет элементы массива сравнивая их по ключевому слову и совпавшие элементы возвращает в массиве.
     * @param key ключевое слово.
     * @return массив с элементами совподающее с ключевым словом.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int counter = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null && items[index].getName().equals(key)) {
                result[counter] = items[index];
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    /**
     * Метод ищет элемент с необходимым id и возвращает искомый элемент.
     * @param id уникальный индекс.
     * @return элемент с уникальным индексом либо null если ничего не найдено.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
