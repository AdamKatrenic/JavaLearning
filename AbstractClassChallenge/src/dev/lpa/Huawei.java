package dev.lpa;

public class Huawei extends ProductForSale{
    public Huawei(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Huawei " + type + " stojí " + price + " €" + " a je vo farbe: " + description);

    }
}
