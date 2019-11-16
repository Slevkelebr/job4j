package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for ( ; index < products.length - 1; index++) {
            products[index] = products[index + 1];
        }
        products[index] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значени из ячейки с индексом 1.");
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        Shop shop = new Shop();
        System.out.println("Иллюстарция работы метода delete.");
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        System.out.println("Вывести массив до использования метода delete.");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("Применям метод delete.");
        shop.delete(products, 1);
        System.out.println("Вывесьи массив после работы метода delete.");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

    }
}

