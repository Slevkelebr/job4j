package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final Long spent;

        public Task(String name, Long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" + "name='" + name + '\'' + ", spent=" + spent + '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Bug #1", 100L));
        tasks.add(new Task("Task #2", 100L));
        tasks.add(new Task("Bug #32", 100L));
        Long total = tasks.stream().map(task -> task.spent
        ).reduce(0L, Long::sum);
        System.out.println(total);

 /*       List<String> names = tasks.stream().map(task -> task.name
        ).collect(Collectors.toList());
        names.forEach(System.out::println);*/

/*        List<Task> bugs = tasks.stream().filter(task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);*/
    }
}
