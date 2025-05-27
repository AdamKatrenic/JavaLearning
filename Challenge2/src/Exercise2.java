public class Exercise2 {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static double toMilesPerHour(double number){
        if(number<0){
            return -1;
        }else if(number>0){
            double convertedNumber = number/1.609344;
            return Math.round(convertedNumber);
        }
        return number;
    }
    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
