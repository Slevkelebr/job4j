package professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String brithday;
    private int experience;

    public Profession(String name, String surname, String education, String brithday, int experience) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.brithday = brithday;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBrithday() {
        return brithday;
    }

    public int getExperience() {
        return experience;
    }

}
