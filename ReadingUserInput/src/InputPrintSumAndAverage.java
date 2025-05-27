import java.util.Scanner;

public class InputPrintSumAndAverage {
    public static void main(String[] args) {

        inputPrintSumAndAverage();

    }

    public static void inputPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int average = 0;
        int sum = 0;
        int loopcount = 0;

        while (true){
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                loopcount++;
                sum += number;
                average = sum/loopcount;
            }catch (NumberFormatException nfe){
                System.out.println("SUM = " + sum + " AVG = " + average);
            }
        }

    }

}
