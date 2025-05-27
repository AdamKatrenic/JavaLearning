package Objekty.cvicenie8;

public class Car {
    int capacity;
    int gasAmountInCar;
    String name;

    public Car(String name, int capacity , int gasAmountInCar) {
        this.capacity = capacity;
        this.gasAmountInCar = gasAmountInCar;
        this.name = name;
    }

    public int getGasAmountInCar() {
        return gasAmountInCar;
    }

    public void fill(int cislo) {
        this.gasAmountInCar += cislo;
    }

    public String getName() {
        return name;
    }

    public void fill() {
    }

    public int getCapacity() {
        return capacity;
    }
}
