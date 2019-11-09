package professions;

public class Engineer extends Profession {

    private String jobStatus;

    public Engineer(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        jobStatus = "в работе";
    }

    void searchSolution() {
    }
}
