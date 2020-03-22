package ru.job4j.condition;

/**
 * class AlertDivByZero - работа оператора ветвления.
 *
 * @author Sergey Frolov (slevkelebr@yandex.ru)
 * @version 0.1
 * @since 22.03.2020
 */
public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(3);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Cold not div by 0.");
        } else if (number < 0) {
            System.out.println("This is negative numbers");
        } else {
            System.out.println("Natural number");
        }
    }
}
