package Services;

import Model.Product;
import Model.Store;

public interface CustomerServices {
    void addProductToCart(int productId, Store store);
    void removeProductFromCart(int productId, Store store);
    void viewProduct(int productId, Store store);
    void viewProducts(int productId, Store store);
}
