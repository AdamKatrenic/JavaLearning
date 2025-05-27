public class SameLastDigit {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        boolean aValid = a>9 && a<1000;
        boolean bValid = b>9 && b<1000;
        boolean cValid = c>9 && c<1000;

        int aLastDigit = a%10;
        int bLastDigit = b%10;
        int cLastDigit = c%10;

        if(aValid==bValid&&bValid==cValid&&cValid==aValid){
            if(aLastDigit==bLastDigit||bLastDigit==cLastDigit||cLastDigit==aLastDigit){
                return true;
            }
        }return false;
    }
}

//public static boolean isValid(int number) {
//    return number >= 10 && number <= 1000;
//}
//
//public static boolean hasSameLastDigit(int a, int b, int c) {
//
//    if (!isValid(a) || !isValid(b) || !isValid(c)) {
//        return false;
//    }
//
//    int lastA = a % 10;
//    int lastB = b % 10;
//    int lastC = c % 10;
//    return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
//}
