package ru.job4j.poly;

public interface Transport {
    void going();

    void passengers(int amount);

    double fillUp(int fuel);
}
