package Loop;

import java.util.Scanner;

public class DrawTriangleNaopak {
    public static void main(String[] args) {
        Scanner trojuholnik = new Scanner(System.in);
        System.out.println("Please enter the pyramid height: ");
        int NumberOfStars = trojuholnik.nextInt();

        for (int i = 1; i <= NumberOfStars; i++) {
            for (int j = 1; j <= NumberOfStars - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 *i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
