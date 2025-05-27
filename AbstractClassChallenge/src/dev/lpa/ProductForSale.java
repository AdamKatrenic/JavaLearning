package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    protected int price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        double totalPrice = getSalesPrice(quantity);
        System.out.printf("Produkty: %s | Cena: %d | Konečná cena: $%.2f%n", type, quantity, totalPrice);
    }

    public abstract void showDetails();
}

class OrderItem {
    private int quantity;
    private ProductForSale product;

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }

    public void printItemizedLine(){
        product.printPricedItem(quantity);
    }
}
