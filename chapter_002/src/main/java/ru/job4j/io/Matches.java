package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            int matches = 11;
            System.out.println("Вас Приветствует Игра ==Matches==");
            System.out.println("1. Правила игры.");
            System.out.println("2. Новая игра.");
            System.out.println("3. Выйти из игры.");
            System.out.print("Выбирите пункт меню: ");
            int select = Integer.valueOf(input.nextLine());
            System.out.println();
            if (select == 1) {
                System.out.println("В игре участвуют двое игрока, которые по очереди берут от 1 до 3 спичек.");
                System.out.println("Всего в игре " + matches + " спичек.");
                System.out.println("Выигрывает тот, кто забрал последние спички.");
                System.out.println();
            } else if (select == 3) {
                System.out.println("Выход из игры.");
                run = false;
            } else if (select == 2) {
                while (matches != 0) {
                    System.out.println("Пожалуйста первый игрок возьми от 1 до 3 спичек");
                    String quanti = String.valueOf(input.nextLine());
                    int quantity;
                    while (quanti.isEmpty()) {
                        System.out.println("Введена пустая строка. Пожалуйста введите число от 1 до 3.");
                        quanti = String.valueOf(input.nextLine());
                    }
                    quantity = Integer.parseInt(quanti);
                    while (quantity > 3) {
                        System.out.print("Введено неверное количество спичек. Пожалуйста введите число от 1 до 3: ");
                        quantity = Integer.valueOf(input.nextLine());
                    }
                    matches = matches - quantity;
                    if (matches == 0) {
                        System.out.println("Ура! У нас есть победитель! Победил первый игрок!");
                        break;
                    }
                    System.out.println("Отлично! Количество оставшихся спичек: " + (matches));
                    System.out.println("Пожалуйста второй игрок возьми от 1 до 3 спичек");
                    quanti = String.valueOf(input.nextLine());
                    while (quanti.isEmpty()) {
                        System.out.println("Введена пустая строка. Пожалуйста введите число от 1 до 3.");
                        quanti = String.valueOf(input.nextLine());
                    }
                    quantity = Integer.parseInt(quanti);
                    while (quantity > 3) {
                        System.out.print("Введено неверное количество спичек. Пожалуйста введите число от 1 до 3: ");
                        quantity = Integer.valueOf(input.nextLine());
                    }
                    matches = matches - quantity;
                    if (matches == 0) {
                        System.out.println("Ура! У нас есть победитель! Победил второй игрок!");
                        break;
                    }
                    System.out.println("Отлично! Количество оставшихся спичек: " + matches);
                }
            }
        }
    }
}
