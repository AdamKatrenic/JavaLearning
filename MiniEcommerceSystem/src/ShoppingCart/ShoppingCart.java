package ShoppingCart;

import Order.OrderItem;
import Product.Product;

public class ShoppingCart {
    private java.util.List<OrderItem> items = new java.util.ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void showCart() {
        for (OrderItem item : items) {
            System.out.println(item.getTotalPrice() + " €");
        }
    }

    public java.util.List<OrderItem> getItems() {
        return items;
    }
}