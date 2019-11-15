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
        boolean result = false;
        for (int i = 0; i != this.position; i++) {
            if (items[i].getId().equals(id)) {
                String number = this.items[i].getId();
                this.items[i] = item;
                this.items[i].setId(number);
                result = true;
                break;
            }
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
        for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, this.items, index, items.length - index - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива без null.
     * @return копия массива.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
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
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }
}
