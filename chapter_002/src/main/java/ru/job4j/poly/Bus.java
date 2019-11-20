package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void going() {
        System.out.println("The bus is going.");
    }

    @Override
    public void passengers(int amount) {
        int total = 40;
        System.out.println(amount + " passengers sat on a bus.");
        total -= amount;
        System.out.println(total + " seats left in the bus.");
    }

    @Override
    public double fillUp(int fuel) {
        double costFuel = 15.5;
        return costFuel * fuel;
    }
}
