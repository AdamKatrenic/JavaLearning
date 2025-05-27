import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
