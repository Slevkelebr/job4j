package ru.job4j.opp;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String question = "WTF?";
        String word = bot.engToRus(question);
        System.out.println(word);
    }
}