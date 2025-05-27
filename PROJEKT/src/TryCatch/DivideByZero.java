package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{

            int divisor = scanner.nextInt();
            int result = 12 / divisor; // If the input value for divisor was 0 the program breaks
            System.out.println(result);// The program doesn't reach this line if the input was 0

        } catch (ArithmeticException e){

            System.out.println("nepis nulku");

        } catch (InputMismatchException e){

            System.out.println("pis cele cisla");

        }
    }
}
//The result if the input value was zero:

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at UnhandledException.main(UnhandledException.java:8)
