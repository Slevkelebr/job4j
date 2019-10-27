package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount + amount * (percent / 100);
        boolean haveDebt = true;
        while (haveDebt) {
            debt -= salary;
            debt = debt + debt * percent / 100;
            if (debt <= 0) {
                haveDebt = false;
            }
            year++;
        }
        return year;
    }
}
