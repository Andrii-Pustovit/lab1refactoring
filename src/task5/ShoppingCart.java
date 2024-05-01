package task5;

import task3_4.Product;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }
}