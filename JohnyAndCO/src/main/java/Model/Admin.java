package Model;

import Services.AdminServices;

import java.util.List;

public class Admin extends Person implements AdminServices {
    private int id;


    public Admin(int id, String name) {
        super(name);
        this.id = id;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    @Override
    public void addProductToStore(Product product, Store store) {

    }

    @Override
    public void removeFromToStore(Product product, Store store) {

    }

    @Override
    public void viewProductInStore(Product product, Store store) {

    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                '}';
    }

}
