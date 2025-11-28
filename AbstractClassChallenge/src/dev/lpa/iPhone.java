package dev.lpa;

public class iPhone extends ProductForSale{

    public iPhone(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Iphone " + type + " stojí " + price + " €" + " a je vo farbe: " + description);
    }
}
