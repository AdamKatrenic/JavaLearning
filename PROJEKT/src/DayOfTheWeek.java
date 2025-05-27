import java.time.DayOfWeek;

public class DayOfTheWeek {
    public static void main(String[] args) {

        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day){
            case 0 -> {yield "Sunday"; }
            case 1 -> {yield "Monday"; }
            case 2 -> {yield "Tuesday"; }
            case 3 -> {yield "Wednesday"; }
            case 4 -> {yield "Thursday"; }
            case 5 -> {yield "Friday"; }
            case 6 -> {yield "Saturday"; }
            default -> {yield "Invalid day";}
            };

        System.out.println(day + " stands for " + dayOfWeek);

        }

    }

