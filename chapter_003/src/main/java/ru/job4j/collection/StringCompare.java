package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int size1 = left.length();
        int size2 = right.length();
        int result = size1 - size2;
        int min = Math.min(size1, size2);
        int index = 0;
        while (index < min) {
            int compare = Character.compare(left.charAt(index), right.charAt(index));
            if (compare != 0) {
                result = compare;
                break;
            }
            index++;
        }
        if (size1 != size2 && result == 0) {
            result = size1 - size2;
        }
        return result;
    }
}
