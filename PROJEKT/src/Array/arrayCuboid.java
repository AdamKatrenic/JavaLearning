package Array;

public class arrayCuboid {
        public static void main(String[] args) {

            double[] dimensions = {10.4, 13.5, 8.2}; // a, b, and c

            //  vol
            double volume = dimensions[0] * dimensions[1] * dimensions[2];

            // surface area
            double surfaceArea = 2 * (dimensions[0] * dimensions[1] + dimensions[1] * dimensions[2] + dimensions[0] * dimensions[2]);

            // Print results
            System.out.printf("Surface Area: %.2f%n", surfaceArea);
            System.out.printf("Volume: %.2f%n", volume);
        }
    }
