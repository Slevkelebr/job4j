package ru.job4j.opp;

/**
 * Class BallStory рассказывает историю колобка, создаёт экземпляры классов
 * и вызывает их методы передавая им в параметре другой экземпляр.
 * @author Slevkelebr.
 * @since 10.11.2019.
 * @version 1.
 */

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        hare.tryEat(kolobok);
        fox.tryEat(kolobok);
        wolf.tryEat(kolobok);
        System.out.println(kolobok.song());
    }
}
