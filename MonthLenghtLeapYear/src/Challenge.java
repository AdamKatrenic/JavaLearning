public class Challenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2020);

    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        } else {
            return false;
        }
    }

    public static void getDaysInMonth(int month, int year) {

        if(isLeapYear(year)) {
            switch (month) {
                case 1 -> System.out.println("31");
                case 2 -> System.out.println("29");
                case 3 -> System.out.println("30");
                case 4 -> System.out.println("31");
                case 5 -> System.out.println("30");
                case 6 -> System.out.println("31");
                case 7 -> System.out.println("30");
                case 8 -> System.out.println("31");
                case 9 -> System.out.println("30");
                case 10 -> System.out.println("31");
                case 11 -> System.out.println("30");
                case 12 -> System.out.println("31");
                default -> System.out.println("-1");
            };
        } else if (!isLeapYear(year)) {
            switch (month)  {
                case 1 -> System.out.println("31");
                case 2 -> System.out.println("28");
                case 3 -> System.out.println("31");
                case 4 -> System.out.println("30");
                case 5 -> System.out.println("31");
                case 6 -> System.out.println("30");
                case 7 -> System.out.println("31");
                case 8 -> System.out.println("30");
                case 9 -> System.out.println("31");
                case 10 -> System.out.println("30");
                case 11 -> System.out.println("31");
                case 12 -> System.out.println("30");
                default -> System.out.println("-1");
            };
        }

    }
}
