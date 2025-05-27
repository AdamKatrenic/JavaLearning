import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadajte velkost array : ");
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[scanner.nextInt()];
        System.out.println("Zadajte " + myArray.length + " cisel : ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Cislo #" + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        readIntegers(myArray);

        System.out.println("Najmensie cislo z array je : ");
        findMin(myArray);
    }

    private static void readIntegers(int[] myArray) {
        System.out.println(Arrays.toString(myArray));
    }

    private static void findMin(int[] myArray) {
        Arrays.sort(myArray);
        System.out.println(myArray[0]);
    }

//    import java.util.Scanner;
//
//    public class MinimumElement {
//
//        private static int readInteger() {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter count: ");
//            int count = scanner.nextInt();
//            return count;
//        }
//
//        private static int[] readElements(int count) {
//
//            Scanner scanner = new Scanner(System.in);
//            int[] array = new int[count];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("Enter a number: ");
//                int number = scanner.nextInt();
//                array[i] = number;
//            }
//            return array;
//        }
//
//        private static int findMin(int[] array) {
//
//            int cmv = Integer.MAX_VALUE;                 // 1
//            for (int i = 0; i < array.length; i++) {     // 2
//                if (array[i] < cmv) {                    // 3
//                    cmv = array[i];                      // 4
//                }
//            }
//            return cmv;
//        }
//    }
}
