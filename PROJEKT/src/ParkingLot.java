import java.util.*;

public class ParkingLot {
        public static void main(String[] args) {
            Random random = new Random();

            // Generate 256 random cars and add them to a list
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < 256; i++) {
                CarType carType = CarType.values()[random.nextInt(CarType.values().length)];
                CarColor carColor = CarColor.values()[random.nextInt(CarColor.values().length)];
                cars.add(new Car(carType, carColor));
            }

            // Count occurrences by type and by color
            Map<CarType, Integer> carTypeCounts = new HashMap<>();
            Map<CarColor, Integer> carColorCounts = new HashMap<>();

            for (Car car : cars) {
                carTypeCounts.put(car.getCarType(), carTypeCounts.getOrDefault(car.getCarType(), 0) + 1);
                carColorCounts.put(car.getCarColor(), carColorCounts.getOrDefault(car.getCarColor(), 0) + 1);
            }

            // Find the most frequently occurring vehicle type and color
            CarType mostFrequentType = Collections.max(carTypeCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
            int mostFrequentTypeCount = carTypeCounts.get(mostFrequentType);

            CarColor mostFrequentColor = Collections.max(carColorCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
            int mostFrequentColorCount = carColorCounts.get(mostFrequentColor);

            // Print the results
            System.out.println("Vehicle counts by type:");
            for (Map.Entry<CarType, Integer> entry : carTypeCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nVehicle counts by color:");
            for (Map.Entry<CarColor, Integer> entry : carColorCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("\nMost frequent type of vehicle:");
            System.out.println(mostFrequentType + " with " + mostFrequentTypeCount + " occurrences");

            System.out.println("\nMost frequent color of vehicle:");
            System.out.println(mostFrequentColor + " with " + mostFrequentColorCount + " occurrences");
        }
    }

