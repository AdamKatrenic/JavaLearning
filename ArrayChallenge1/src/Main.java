import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] firstArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(100);
        }
        System.out.println("First Array: " + Arrays.toString(firstArray));

        Arrays.sort(firstArray);

        reverse(firstArray);
        System.out.println(Arrays.toString(firstArray));
    }

    public static void reverse(int[] firstArray) {
        int n = firstArray.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = firstArray[i];
            firstArray[i] = firstArray[n-i-1];
            firstArray[n-i-1] = temp;
        }
    }
}
