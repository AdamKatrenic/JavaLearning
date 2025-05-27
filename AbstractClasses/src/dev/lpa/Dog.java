package dev.lpa;

public class Dog extends Mammal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if (speed == "slow"){
            System.out.println(getExplicitType() + " walking");
        }else {
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {

        System.out.println(getExplicitType() + " sheds hair all the time");
    }

    @Override
    public void makeNoise() {

        if (type == "Wolf"){
            System.out.print("Hwoling! ");
        }else {
            System.out.print("Woof! ");
        }

    }
}
