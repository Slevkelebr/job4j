package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student -> student.getUnits().stream()
               .map(group -> new Holder(group, student.getName()))) // собираем объект Holder с unit и name
                .collect(Collectors.groupingBy(h -> h.key, // определяем группировку
                        Collector.of(
                                HashSet::new,  //supplier
                                (set, el) -> { // аккумулятор.
                                    set.add(el.value); // как добавлять данные.
                                },
                                (left, right) -> { // combiner
                                    left.addAll(right);
                                    return left;
                                        } // для агрегации.
                        )
                )
        );
    }
}