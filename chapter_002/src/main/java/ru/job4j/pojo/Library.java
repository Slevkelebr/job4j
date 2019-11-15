package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Main story", 200);
        Book book2 = new Book("Main fantasy", 100);
        Book book3 = new Book("King of Rings", 1000);
        Book book4 = new Book("Clean code", 350);

        Book[] mainLibrary = new Book[]{book1, book2 , book3 , book4};

       for (int index = 0; index < mainLibrary.length; index++) {
           Book book = mainLibrary[index];
           System.out.println(book.getName() + " - " + book.getNumberPages());
       }

       System.out.println("Меняю местами первую и последнюю книгу.");

       Book reserv = mainLibrary[0];
       mainLibrary[0] = mainLibrary[3];
       mainLibrary[3] = reserv;

        for (int index = 0; index < mainLibrary.length; index++) {
            Book book = mainLibrary[index];
            System.out.println(book.getName() + " - " + book.getNumberPages());
        }

        System.out.println("Книги с названием Clean code.");

        for (int index = 0; index < mainLibrary.length; index++) {
            Book book = mainLibrary[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumberPages());
            }
        }
    }
}
