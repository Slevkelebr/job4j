package ru.job4j.opp;

public class Jukebox {

    public void music(int position) {
        if (position == 1 || position == 2) {
            if (position == 1) {
                System.out.println("Пусть бугут неуклюже.");
            } else {
                System.out.println("Спокойной ночи.");
            }
        } else {
            System.out.println("Песня не найдена.");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        int[] arraySong = {1, 2, 3};
        for (int number: arraySong
             ) {
            song.music(number);
        }

    }
}
