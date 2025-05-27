public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstN, double secondN) {
        int firstRounded = (int) (firstN * 1000);
        int secondRounded = (int) (secondN * 1000);

        return firstRounded == secondRounded;
    }
}
