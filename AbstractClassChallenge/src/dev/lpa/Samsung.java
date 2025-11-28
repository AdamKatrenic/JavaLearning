package dev.lpa;

public class Samsung extends ProductForSale{
    public Samsung(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Samsung " + type + " stojí " + price + " €" + " a je vo farbe: " + description);
    }
}
