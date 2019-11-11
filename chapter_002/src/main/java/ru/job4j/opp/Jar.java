package ru.job4j.opp;

/**
 * Класс создаёт два сосуда, и происходит взаимодействие двух объектво.
 * @author Slevkelebr.
 * @since 10.11.2019
 */

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
       this.value = (this.value + another.value) / 2;
       another.value = this.value;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(4);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}