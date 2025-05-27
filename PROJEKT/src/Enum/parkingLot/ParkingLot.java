/*package Enum.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParkingLot {
    public static void main(String[] args) {


        List<Car> ListOfCars = new ArrayList<>();
        Random random1 = new Random();
        for (int i = 0; i < 256; i++) {
            ListOfCars.add(new Car(
                    Car.Cartype.values()[random1.nextInt(Car.Cartype.values().length)],
                    Car.CarColor.values()[random1.nextInt(Car.CarColor.values().length)]));
        }
        for (int i = 0; i < ListOfCars.size(); i++) {
            System.out.println(ListOfCars.get(i));
        }

        System.out.println();

    }
}*/
