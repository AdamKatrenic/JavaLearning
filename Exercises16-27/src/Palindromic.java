public class Palindromic {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int n) {
        int real = n;
        int reverse = 0;
        int lastDigit = 0;

        if (n != 0){
            while (n != 0) {
                lastDigit = n % 10;
                n = n / 10;
                reverse = reverse * 10 + lastDigit;
            }
            if (reverse == real){
                return true;
            }else return false;
        }
        return false;
    }
}
