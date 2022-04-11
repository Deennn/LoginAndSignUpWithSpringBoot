package Model;

import Enums.Brands;
import Enums.Categories;

public class Product {
    private String name;
    private int id;
    private Brands brands;
    private Categories categories;
    private double price;
    private int quantity;

    public Product(String name, int id, Brands brands, Categories categories, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.brands = brands;
        this.categories = categories;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", brands=" + brands +
                ", categories=" + categories +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
