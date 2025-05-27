import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 1;

        do {
            System.out.println("Enter number #" + count + ":");
            String number = input.nextLine();
            try {
//                int num = Integer.parseInt(number);
                double num = Double.parseDouble(number);
                count++;
                sum += num;
            }catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }while (count <=5);

        System.out.println("The sum is " + sum);
    }
}
