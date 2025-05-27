package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductForSale> productsForSale;
    private List<OrderItem> OrderItems;

    public Store(){
        productsForSale = new ArrayList<>();
        OrderItems = new ArrayList<>();
    }

    public void addProduct(ProductForSale product){
        productsForSale.add(product);
    }

    public void listProducts(){
        System.out.println("Produkty k dispozícii:");
        for (int i = 0; i < productsForSale.size(); i++) {
            System.out.println("\nProduct #" + (i + 1));
            productsForSale.get(i).showDetails();
        }
    }

    public void addOrderItem(int productId, int quantity){
        if(productId<0 || productId>=productsForSale.size()){
            System.out.println("Invalid product ID");
            return;
        }

        ProductForSale product = productsForSale.get(productId);
        OrderItem item = new OrderItem(quantity,product);
        OrderItems.add(item);
    }

    public void printOrder(){
        System.out.println("\nOrder Receipt:");
        for(OrderItem item : OrderItems){
            item.printItemizedLine();
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new iPhone("15",1500,"RED"));
        store.addProduct(new Huawei("P30",500,"BLACK"));
        store.addProduct(new Samsung("S25",2000,"WHITE"));

        store.listProducts();

        store.addOrderItem(0,2);
        store.addOrderItem(1,5);
        store.addOrderItem(2,10);

        store.printOrder();
    }
}
