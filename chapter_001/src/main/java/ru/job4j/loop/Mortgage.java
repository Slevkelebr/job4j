package ru.job4j.loop;

/**
 * Класс вычисляет колчество лет для выплаты ипотеки при определенным проценте.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Mortgage {

    /**
     * Метод считает количество лет для выплаты ипотеки.
     * @param amount сумма выданная по кредиту.
     * @param salary годовой доход.
     * @param percent процентая ставка по кредиту.
     * @return количество лет.
     */
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
