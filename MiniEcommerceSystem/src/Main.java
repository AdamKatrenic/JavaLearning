import Order.Order;
import Product.Product;
import User.CustomerUser;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 800, 10);
        Product p2 = new Product("Mobil", 500, 5);

        CustomerUser customer = new CustomerUser("jan", "heslo123");
        customer.getCart().addProduct(p1, 1);
        customer.getCart().addProduct(p2, 2);

        Order order = new Order(customer.getCart().getItems());
        order.printInvoice();
    }
}