package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new TreeSet<>(deps);
        for (String value : deps) {
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == '/') {
                    String department = value.substring(0, i);
                    if (!deps.contains(department)) {
                        tmp.add(department);
                    }
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {

    }

    public static void sortDesc(List<String> orgs) {
        Set<String> result = new TreeSet<>(new DepDescComp());
    }
}
