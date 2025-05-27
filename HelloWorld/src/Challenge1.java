public class Challenge1 {
    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100;
        System.out.println("My values total " + thirdDouble);
        double remainder = thirdDouble % 40.00d;

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("Is no remainder " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
