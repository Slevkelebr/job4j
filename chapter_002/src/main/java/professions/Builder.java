package professions;

public class Builder extends Engineer {

    String constructionScheme;

    public Builder(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        constructionScheme = "параллельная";
    }

    void searchSolution() {
    }

    void mixSolution() {
    }
}
