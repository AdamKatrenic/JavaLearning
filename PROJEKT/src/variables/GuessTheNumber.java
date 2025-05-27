package variables;

import java.util.Scanner;

public class GuessTheNumber {
    //public class variables.GuessTheNumber {
    //  public static void main(String[] args) {
    //    int storedNumber = 8;
    //    // Write a program that stores a number and the user has to figure it out.
    //    // The user can input guesses. After each guess the program responds
    //    // with a message indicating whether the stored number is smaller or
    //    // greater than the guess.
    //    // The program ends (exits) when the user finds the stored number
    //    //
    //    // Example:
    //    //
    //    // Please enter your guess: 3
    //    // The stored number is greater than 3
    //    // Please enter your guess: 10
    //    // The stored number is smaller than 10
    //    // Please enter your guess: 8
    //    // You have found the stored number 8
    //    //
    //  }
    //}

    public static void main(String[] args) {
        int secretNumber = 13;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Zadaj cislo :");
        int zadaneCislo = scan1.nextInt();

            if (zadaneCislo == secretNumber) {
                System.out.println("Vase cislo je spravne");
            } else if (zadaneCislo > secretNumber) {
                System.out.println("Vase cislo je mensie ako" + zadaneCislo);
            } else {
                System.out.println("Vase cislo je vacsie ako" + zadaneCislo);
            }
        }
}

