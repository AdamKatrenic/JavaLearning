import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj velkost arrayu : ");
        int n = scanner.nextInt();

        // Voláme getIntegers, ktorá načíta čísla a vráti pole
        int[] scannerArray = getIntegers(n);

        // Vypíšeme pôvodné pole
        printArray(scannerArray);

        // Zoradíme pole
        sortIntegers(scannerArray);
    }

    // Metóda načíta n čísel od používateľa a vráti ich ako pole
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Zadajte " + size + " čísel:");

        for (int i = 0; i < size; i++) {
            System.out.print("Číslo " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Vypíše pole
    public static void printArray(int[] array) {
        System.out.println("\nZadané čísla:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " obsahuje: " + array[i]);
        }
    }

    // Zoradí a vypíše pole
    public static void sortIntegers(int[] array) {
        // Skopírujeme pôvodné pole, aby sme nemenili originál
        int[] sortedArray = Arrays.copyOf(array, array.length);

        // Vlastné zoradenie od najväčšieho po najmenší (bublinkové triedenie)
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    // prehodenie prvkov
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        // Vypíšeme zoradené pole
        System.out.println("\nZoradené pole (od najväčšieho po najmenší): " + Arrays.toString(sortedArray));
    }
}

//UDEMY RIESENIE

//import java.util.Scanner;
//import java.util.Arrays;

//public class Main {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int[] getIntegers(int capacity) {
//
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[capacity];
//        System.out.println("Enter " + capacity + " integer values:\r");
//        for (int i=0; i<array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    public static int[] sortIntegers(int[] array) {
//
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i=0; i<sortedArray.length-1; i++) {
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];                     // 1
//                    sortedArray[i] = sortedArray[i+1];         // 2
//                    sortedArray[i+1] = temp;                   // 3
//                    flag = true;                               // 4
//                }
//            }
//        }
//        return sortedArray;
//    }
//}
