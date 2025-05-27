import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new LinkedList<>();

        cities.add(new City("Adelaide", 1374));
        cities.add(new City("Alice Springs", 2771));
        cities.add(new City("Brisbane", 917));
        cities.add(new City("Darwin", 3972));
        cities.add(new City("Melbourne", 877));
        cities.add(new City("Perth", 3923));

        cities.sort(Comparator.comparing(City::getDistanceFromSydney));

        interactiveMenu(cities);
    }

    public static void interactiveMenu(List<City> cities) {
        ListIterator<City> iterator = cities.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        printMenu();

        while (!quit) {
            System.out.print("Enter action: ");
            String action = scanner.nextLine().toUpperCase();

            switch (action) {
                case "F":
                    if (!goingForward) {
                        if (iterator.hasNext()) iterator.next();
                        goingForward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now visiting: " + iterator.next());
                    } else {
                        System.out.println("End of the list reached.");
                    }
                    break;
                case "B":
                    if (goingForward) {
                        if (iterator.hasPrevious()) iterator.previous();
                        goingForward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Now visiting: " + iterator.previous());
                    } else {
                        System.out.println("Start of the list reached.");
                    }
                    break;
                case "L":
                    printCities(cities);
                    break;
                case "M":
                    printMenu();
                    break;
                case "Q":
                    quit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("""
                Available actions (select letter):              
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    public static void printCities(List<City> cities) {
        System.out.println("Places in the list:");
        for (City city : cities) {
            System.out.println(city);
        }
    }

    public static class City {
        String name;
        int distanceFromSydney;

        public City(String name, int distanceFromSydney) {
            this.name = name;
            this.distanceFromSydney = distanceFromSydney;
        }

        public int getDistanceFromSydney() {
            return distanceFromSydney;
        }

        @Override
        public String toString() {
            return name + " (" + distanceFromSydney + " km)";
        }
    }
}