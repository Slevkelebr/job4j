package ru.job4j.opp;

/**
 * Класс создан, что бы показать как с помощью одного класса можно прописать взаимодействие двух объектов.
 * @author Slevkelebr.
 * @since 10.11.2019
 */

public class Battery {
    private int load;

    /**
     * Конструктор класса.
     * @param size заряд батареи.
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * Метод производит обмен заряда между двумя батареями.
     * @param another второй экземпляр батареи.
     */
    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = another.load + another.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(14);
        Battery second = new Battery(4);
        System.out.println("first: " + first.load + ". second: " + second.load);
        first.exchange(second);
        System.out.println("first: " + first.load + ". second: " + second.load);

    }
}
