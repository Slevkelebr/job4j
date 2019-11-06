package ru.job4j.array;

/**
 * Класс из входящего массива элементов, находит необходимый индекс элемента, удовлетворяющий условию.
 * @author Slevkelebr.
 * @since 11.2019.
 * @version 1.
 */

public class FindLoop {

    /**
     * Метод реализует классический поиск перебором.
     * @param data входящий массив элементов.
     * @param el Условие. Элемент который нужно найти в массиве.
     * @return индекс искомого элемента или -1 если элемент не найден.
     */
    public  int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод реализует поиск перебором в указанном диапазоне.
     * @param data массив элементов в котором нужно найти элемент.
     * @param el Условие. Искомый элемент.
     * @param start Начало диапазона для поиска.
     * @param finish Конец диапазона для поиска.
     * @return индекс искомого элемента или -1 если элемент не найден.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst  = -1;
        for ( ; start <= finish; start++) {
            if (data[start] == el) {
                rst = start;
                break;
            }
        }
        return rst;
    }
}
