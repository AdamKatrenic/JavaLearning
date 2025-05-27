
    import java.util.*;

    // Define enums for car types and colors
    enum CarType {
        SEDAN, SUV, TRUCK, VAN, COUPE;
    }

    enum CarColor {
        RED, BLUE, GREEN, BLACK, WHITE;
    }

    // Define the Car class
    class Car {
        private CarType carType;
        private CarColor carColor;

        public Car(CarType carType, CarColor carColor) {
            this.carType = carType;
            this.carColor = carColor;
        }

        public CarType getCarType() {
            return carType;
        }

        public CarColor getCarColor() {
            return carColor;
        }
    }
