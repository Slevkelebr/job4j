package ru.job4j.opp;

public class HierarchyUsage {
    public static void main(String[] args) {
        // создаем объект класса Car.
        Car car = new Car();
        // делаем приведение к типу родителя Transport.
        Transport tp = car;
        // делаем приведение к типу родителя Object.
        Object obj = car;
        // приведение типа при создании объекта.
        Object ocar = new Car();
        // приведение типа за счет повышения по иерархии.
        Car carFromObject = (Car) ocar;

        // оибка в приведении типа.
        Object bicycle = new Bicycle();
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
