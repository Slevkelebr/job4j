package ru.job4j.search;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = IntStream.range(0, this.tasks.size())
                .filter(i -> this.tasks.get(i).getPriority() >= task.getPriority())
                .findFirst()
                .orElse(0);

        /*tasks.stream()
                .filter(tasks -> task.getPriority() < tasks.getPriority())
                .reduce((tmp, tsk) -> tasks.add(, tmp));*/
/*        for (Task tmp : tasks) {
            if (task.getPriority() < tmp.getPriority()) {
                break;
            }
            index++;
        }*/

        tasks.add(index, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}