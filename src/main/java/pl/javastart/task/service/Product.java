package pl.javastart.task.service;

public class Product {
    private String name;
    private String description;
    private double nettPrice;
    private String category;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    double getNettPrice() {
        return nettPrice;
    }

    void setNettPrice(double nettPrice) {
        this.nettPrice = nettPrice;
    }

    String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    public Product(String name, String description, int nettPrice, String category) {
        this.name = name;
        this.description = description;
        this.nettPrice = nettPrice;
        this.category = category;
    }
}
