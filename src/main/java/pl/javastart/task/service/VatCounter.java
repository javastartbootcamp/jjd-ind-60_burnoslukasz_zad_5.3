package pl.javastart.task.service;

public class VatCounter {
    public double getGrossPrice(Product product) {
        switch (product.getCategory()) {
            case "Sport" -> product.setNettPrice(product.getNettPrice() * 1.5);
            case "Casual" -> product.setNettPrice(product.getNettPrice() * 1.2);
            default -> product.setNettPrice(product.getNettPrice() * 1.4);
        }
        return product.getNettPrice();

    }

}