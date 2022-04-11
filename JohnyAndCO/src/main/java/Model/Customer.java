package Model;

import Services.CustomerServices;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements CustomerServices {


    private int id;
    private double wallet;
    private List<Product> cart;

    public Customer(String name) {
        super(name);
    }

    public Customer(String name, int id, double wallet) {
        super(name);
        this.id = id;
        this.wallet = wallet;
        this.cart = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }



    @Override
    public void addProductToCart(int productId, Store store) {

    }

    @Override
    public void removeProductFromCart(int productId, Store store) {

    }

    @Override
    public void viewProduct(int productId, Store store) {

    }

    @Override
    public void viewProducts(int productId, Store store) {

    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", wallet=" + wallet +
                ", cart=" + cart +
                '}';
    }
}
