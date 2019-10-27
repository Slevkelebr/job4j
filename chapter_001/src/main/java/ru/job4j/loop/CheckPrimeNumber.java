package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter <= 2) {
            prime = true;
        }
        return prime;
    }
}
