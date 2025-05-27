import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max =0;
        double min =0;
        int loopCount = 0;

        while (true){
            System.out.println("Enter a number, or any character to exit");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (validNum < min || loopCount == 0) {
                    min = validNum;
                }

                if (validNum > max || loopCount == 0) {
                    max = validNum;}
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }

        if(loopCount>0){
            System.out.println("min = " +min + " max = " +max);
        }else {
            System.out.println("No valid data entered");
        }
    }


}
