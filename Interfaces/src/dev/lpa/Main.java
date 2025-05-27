package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);

        System.out.println("-".repeat(30));

        inFlight(new Jet());

        System.out.println("-".repeat(30));

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled*FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travelled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled>betterfliers = new LinkedList<>();
        betterfliers.add(bird);

        System.out.println("-".repeat(30));

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterfliers);
        flyFliers(betterfliers);
        landFliers(betterfliers);

    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }
}
