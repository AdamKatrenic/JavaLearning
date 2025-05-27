public class FirstLastNumSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = number%10;
        int reversedNumber = 0;
        int sum = 0;

        if (number >= 0) {
            while (number > 0) {
                first = number % 10;
                number = number / 10;
                reversedNumber = reversedNumber * 10 + last;
                sum = first + last;
            }return sum;
        }return -1;
    }
}






//int cislo = number;
//int first = 0;
//int last = 0;
//int sum = 0;
//
//        if (number>0){
//        while (number > 0) {
//number = number / 10;
//first = first + (number % 10);
//last = last + (number % 10);
//sum = first + last;
//            }
//                    }return sum;



//for (int i = 0; i < number; i++) {
//        while(number > 0){
//last = number % 10;
//number = number / 10;
//reversedNumber = reversedNumber + 1;
//        }
//        }return reversedNumber;