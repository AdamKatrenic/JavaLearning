package dev.lpa;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.print(getExplicitType() + " shedins in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
