package ru.job4j.professions;

public class Surgeon extends Doctor {

    private String region;

    public Surgeon(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        region = "глазной";
    }

    void treatPatient() {
    }

    void makelncision() {
    }
}
