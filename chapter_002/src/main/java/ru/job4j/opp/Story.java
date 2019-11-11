package ru.job4j.opp;

/**
 * Class Story создаёт три объекта истории и вызывает
 * у каждого объекта методы и передаёт в них другие созданные объекты.
 * @author Slevkelebr.
 * @since 10.11.2019.
 * @version 1.
 */

public class Story {

    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
