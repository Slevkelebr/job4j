package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String [] args) {
        double man = manWeight(172);
        System.out.println("Man 172 is " + man);
        double women = womanWeight(162);
        System.out.println("Women 162 is " + women);
    }
}
