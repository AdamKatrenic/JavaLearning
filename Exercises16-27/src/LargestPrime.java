public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        int largestPrime =0;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        if (number > 2) {
            largestPrime = number;
        }return  largestPrime;
    }
}

//for (int i = 2; i < number; i++){
//        if (number % i == 0){
//prime = i;
//            }
//                    if (prime*i == number){
//        return prime;
//            }
//                    }return prime;
