public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");

    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return ((heightInFeet *12) + heightInInches) * 2.54;
    }
}
