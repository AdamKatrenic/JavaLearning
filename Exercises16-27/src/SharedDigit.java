public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit (int number1, int number2) {
        if (number1 > 10 && number2 > 10 && number1 < 99 && number2 < 99) {
            for (int i = 0; i < number1; i++) {
                int firstDigitLast = number1 %10;
                int secondDigitLast = number2 %10;
                int firstDigitFirst = number1 / 10;
                int secondDigitFirst = number2 / 10;
                if (firstDigitLast == secondDigitLast || firstDigitLast == secondDigitFirst) {
                    return true;
                } else if (secondDigitLast == firstDigitLast || secondDigitLast == secondDigitFirst) {
                    return true;
                }
            }
        }return false;
    }
}

//public static boolean hasSharedDigit(int first, int second) {
//
//    boolean firstValid = first > 9 && first < 100;
//    boolean secondValid = second > 9 && second < 100;
//
//    if (!firstValid || !secondValid) {
//        return false;
//    }
//
//    int firstLeftDigit = first / 10;
//    int firstRightDigit = first % 10;
//    int secondLeftDigit = second / 10;
//    int secondRightDigit = second % 10;
//
//    boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
//    boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;
//
//    return firstShared || secondShared;
//}
