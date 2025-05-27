public class Main {
    public static void main(String[] args) {

        System.out.println(getMinutesString(3945));
        System.out.println(getMinutesString(65,45));

    }

    public static String getMinutesString(int seconds){
        int minutes = seconds/60;
        return getMinutesString(minutes, seconds);
    }

    public static String getMinutesString(int minutes, int seconds) {

        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";

    }
}
