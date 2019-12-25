package ru.job4j.bank;

/**
 * Банковские переводы.
 * @author Slevkelebr
 * @version 1.0
 * @since 25.12.2019
 */

public class Account {
    private double value;
    private String requisites;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * Переводит деньги другому пользователю.
     * @param destination счет получателя.
     * @param amount сумма отправления.
     * @return true если перевод удался.
     */
    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount <= this.value && destination != null) {
            success = true;
            this.value -= amount;
            destination.value += amount;
        }
        return success;
    }
}
