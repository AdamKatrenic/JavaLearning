package Order;

import Product.Product;

public class OrderItem {
    private Product product;
    private String name;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.name = product.getName();
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}