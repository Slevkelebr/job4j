package ru.job4j.var;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        var count = 0;
        var index = -1;
        for (var tmp : tasks) {
            index++;
            if (task.getPriority() < tmp.getPriority()) {
                count = index;
                break;
            }
        }
        tasks.add(count, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}