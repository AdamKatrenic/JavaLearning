public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    //riesenie zo stranky kt robi to iste co moje

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }

        // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }

        return sum;
    }
}

//moje funkcne riesenie kt z nejakeho dovodu stranka neberie xd
//public static int getEvenDigitSum(int number) {
//
//    int digit = 0;
//    int evenDigit = 0;
//
//    if (number > 0) {
//        while (number > 0) {
//            digit = number % 10;
//            if (digit % 2 == 0) {
//                evenDigit += digit;
//            }
//            number /= 10;
//        }return evenDigit;
//    }return -1;
//}
