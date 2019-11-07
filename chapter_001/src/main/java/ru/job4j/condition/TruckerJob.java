package ru.job4j.condition;

/**
 * Класс поверяет на коком траспорте может водитель передвигаться, в зависимости от наличии котегории прав.
 * @author Slevkelebr.
 * @since 10.2019
 */

public class TruckerJob {

    /**
     * Метод проверяет наличие у вадителя категории прав и траспорт на котором ом может преедвигаться.
     * @param args массива строк.
     */
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('B');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve does not have a job, but ride on motorbike!");
        }
    }
}
