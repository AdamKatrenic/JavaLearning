package CodeWars;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    //Given a number n, return the number of positive odd numbers below n, EASY!
    //
    //Examples (Input -> Output)
    //7  -> 3 (because odd numbers below 7 are [1, 3, 5])
    //15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
    //Expect large Inputs!

    public static void main(String[] args) {

        System.out.println("Zadajte cislo: ");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                int cislo = scanner.nextInt();
                int[] allNum = new int[cislo];
                int[] evenNum = new int[cislo];
                int[] oddNum = new int[cislo];

                int oddPocitadlo = 0;
                int evenPocitadlo = 0;

                for (int i = 0; i < cislo; i++) {
                    System.out.print("Enter a number: " + (i + 1) + " : ");
                    allNum[i] = scanner.nextInt();
                    if (allNum[i] % 2 == 0) {
                        evenNum[evenPocitadlo++] = allNum[i];
                    } else {
                        oddNum[oddPocitadlo++] = allNum[i];
                    }
                }
                System.out.println("Neparne cisla su: ");
                for (int i = 0; i < allNum.length; i++) {
                    System.out.print(oddNum[i] + ", ");
                }
                System.out.println(" ");

                System.out.println("Parne cisla su: ");
                for (int i = 0; i < allNum.length; i++) {
                    System.out.print(evenNum[i] + ", ");
                }
                System.out.println(" ");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dont type string pls :D");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}


