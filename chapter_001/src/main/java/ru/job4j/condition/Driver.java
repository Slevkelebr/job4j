package ru.job4j.condition;

/**
 * Класс проверяет наличие категории прав для управления траспортом.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class Driver {

    /**
     * Категория прав водителя по умолчанию отсутствует.
     */
    private char license = 'N';

    /**
     * Метод проверяет соотвествие категории прав одной из трёх.
     * @param category категория прав.
     */
    public void passExamOn(char category) {
        this.license = category;
    }

    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }

    public boolean canDrive(char category) {
        return this.license == category;
    }
}
