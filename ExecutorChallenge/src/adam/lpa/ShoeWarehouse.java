package adam.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShoeWarehouse {

    private List<Order> shippingItems;

    private final ExecutorService fulfilmentService;

    public final static String[] PRODUCT_LIST =
            {"Running Shoes", "Sandals", "Boots", "Slippers", "High Tops"};

    public ShoeWarehouse() {
        this.shippingItems = new ArrayList<>();
        fulfilmentService = Executors.newFixedThreadPool(3);
    }

    public void shutDown() {
        fulfilmentService.shutdown();
    }

    public synchronized void receiveOrder(Order item) {

        while (shippingItems.size() > 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shippingItems.add(item);
        System.out.println(Thread.currentThread().getName() + " Incoming: " + item);
        fulfilmentService.submit(this::fulfillOrder);
        notifyAll();
    }

    public synchronized Order fulfillOrder() {

        while (shippingItems.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Order item = shippingItems.remove(0);
        System.out.println(Thread.currentThread().getName() + " Fulfilled: " + item);
        notifyAll();
        return item;
    }
}
