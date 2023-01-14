package pl.javastart.task;

import pl.javastart.task.service.Product;
import pl.javastart.task.service.VatCounter;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Shoes", "Comfortable mountains shoes", 100, "Sport");
        Product product2 = new Product("Shoes", "Elegant, casual shoes", 100, "Casual");
        Product product3 = new Product("Shoes", "Others", 100, "Other");

        VatCounter vatCounter = new VatCounter();

        double grossPrice1 = vatCounter.getGrossPrice(product1);
        double grossPrice2 = vatCounter.getGrossPrice(product2);
        double grossPrice3 = vatCounter.getGrossPrice(product3);

        System.out.println("Gross prices of products 1: " + grossPrice1);
        System.out.println("Gross price of product 2: " + grossPrice2);
        System.out.println("Gross price of product 3: " + grossPrice3);
    }
}
