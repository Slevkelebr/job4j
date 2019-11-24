package ru.job4j.stargery;

public class Square implements Shape {

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++" + System.lineSeparator());
        pic.append("+  +" + System.lineSeparator());
        pic.append("+  +" + System.lineSeparator());
        pic.append("++++" + System.lineSeparator());
        return pic.toString();
    }
}
