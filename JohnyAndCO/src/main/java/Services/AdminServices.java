package Services;

import Model.Product;
import Model.Store;

public interface AdminServices {

    void addProductToStore(Product product, Store store);
    void removeFromToStore(Product product, Store store);
    void viewProductInStore(Product product, Store store);
}
