package Functions;

import java.util.Scanner;

public class funkciaFactorial {
    ///  Create the usual class wrapper (Factorial) and main method on your own
    //
    //// - Create a function called calculateFactorial()
    ////   that returns the factorial of its input
    ////
    //// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
    public static void main(String[] args) {
        Scanner cislo = new Scanner(System.in);
        System.out.println("Zadajte cislo: ");
        int number = cislo.nextInt();
        int vysledok = calculateFactorial(number);
        System.out.println("Zadane cislo je : " + number);
        System.out.println("Factorial je : " + vysledok);
    }
    public static int calculateFactorial(int priklad){
        int factorial = 1;
        for (int i = 1; i <= priklad; i++) {
            factorial *= i;



        }
        return factorial;

    }
}
