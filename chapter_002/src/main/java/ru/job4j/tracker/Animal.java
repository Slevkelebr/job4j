package ru.job4j.tracker;

public class Animal {

    public Animal(String name) {
        super();
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
