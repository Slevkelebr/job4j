package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int size1 = o1.length();
        int size2 = o2.length();
        int result = size1 - size2;
        int min = Math.min(size1, size2);
        int index = 0;
        while (index < min) {
            int compare = Character.compare(o2.charAt(index), o1.charAt(index));
            if (compare != 0) {
                result = compare;
                break;
            }
            index++;
        }
        return result;
    }
}