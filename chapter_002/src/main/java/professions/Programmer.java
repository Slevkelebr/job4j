package professions;

public class Programmer extends Engineer {

    String programLanguage;

    public Programmer(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        programLanguage = "Java";
    }

    void searchSolution() {
    }

    void architectureSearch() {
    }
}
