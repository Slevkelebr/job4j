package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student sergey = new Student();
        sergey.setFio("Frolov Sergey Sergeevich");
        sergey.setGroup("Intern");
        sergey.setReceiptDate("28.10.2018");

        System.out.println(sergey.getFio() + " entered the group " + sergey.getGroup() + " " + sergey.getReceiptDate() + " in the year.");
    }
}
