package Objekty.cvicenie8;

public class Tankovanie {
    //Create Station and Car classes
    //Station
    //it stores how much gas is available: gasAmountInCar
    //the gas amount must be given when we create a station
    //it can refill a car: refill(car):
    //decreases the gasAmountInCar by the capacity of the car(let us suppose that the car is empty) and
    //increases the car's gasAmountInCar
    //Car
    //it stores how much gas is actually present: gasAmountInCar
    //it stores the capacity of the tank: capacity
    //create a constructor for the Car class where you:
    //initialize gasAmountInCar -> 0
    //initialize capacity -> 100
    public static void main(String[] args) {

        Station benzinkaShell = new Station(1000);

        Car mercedesBiely = new Car("Mercedes", 100, 50);
        Car audiCierne = new Car("Audi",150, 70);
        Car bmwModre = new Car("BMW", 4000, 3000);


        System.out.println("Benzinka zacina na :" + benzinkaShell.gasAmountInStation);

        benzinkaShell.refill(mercedesBiely);
        System.out.println(benzinkaShell.gasAmountInStation);
        benzinkaShell.refill(audiCierne);
        System.out.println(benzinkaShell.gasAmountInStation);
        benzinkaShell.refill(bmwModre);
        System.out.println(benzinkaShell.gasAmountInStation);
    }

}
