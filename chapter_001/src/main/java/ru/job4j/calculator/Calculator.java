package ru.job4j.calculator;

/**
 * Class Calculator примитивный калькулятор.
 * @author Slevkelebr.
 * @since 28.10.2019
 */
public class Calculator {
    /**
     * Метод сложения.
     * @param first первое число.
     * @param second второе число.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Метод деления.
     * @param first первое число.
     * @param second второе число.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Метод умножения.
     * @param first первое число.
     * @param second второе число.
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Метод вычитания.
     * @param first первое число.
     * @param second второе число.
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Method main Запускает нашу программу, вызывая по очереди методы имитирующие операции сложения, вычетания, умножения и деления.
     * @param args Массив строк.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
