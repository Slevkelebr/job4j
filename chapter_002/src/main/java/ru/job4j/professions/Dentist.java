package ru.job4j.professions;

public class Dentist extends Doctor {

    private int curedTeeth;

    public Dentist(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        curedTeeth = 234;
    }

    void treatPatient() {
    }

    void giveAdvice() {
    }
}
