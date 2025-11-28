package Order;

import User.User;

public class Order {
    private java.util.List<OrderItem> items;
    private double total;

    public Order(java.util.List<OrderItem> items) {
        this.items = items;
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.getTotalPrice();
        }
        return sum * 1.20; //DPH 20%
    }

    public void printInvoice() {
        System.out.println("Faktúra:");

        for (OrderItem item : items) {
            System.out.println(item.getName()+ " -> " + item.getTotalPrice() + " €");
        }
        System.out.println("Celkom s DPH: " + total + " €");
    }
}