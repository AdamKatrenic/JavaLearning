package variables;

import java.util.Scanner;

public class kalkulacka {
        public static void main(String[] args) {
            // Create a program which prints the multiplication table for a specified
            // number
            //
            // Example:
            // The number 15 should print:
            //
            // 1 * 15 = 15
            // 2 * 15 = 30
            // 3 * 15 = 45
            // 4 * 15 = 60
            // 5 * 15 = 75
            // 6 * 15 = 90
            // 7 * 15 = 105
            // 8 * 15 = 120
            // 9 * 15 = 135
            // 10 * 15 = 150

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Zadajte cislo 1:");
            int zadaneCislo = scan1.nextInt();

            for (int i = 1; i < 11; i++) {
                int vysledok = i * zadaneCislo;
                System.out.println(i + " * " + zadaneCislo + " = " + vysledok);
                
            }
                

        }

    }
