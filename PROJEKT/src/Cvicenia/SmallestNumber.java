package Cvicenia;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        //Write a Java method to find the smallest number among three numbers.
        //Test Data:
        //Input the first number: 25
        //Input the Second number: 37
        //Input the third number: 29
        //Expected Output:
        //
        //The smallest value is 25.0


        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number: ");
        double z = in.nextDouble();

        System.out.println("The smallest number is: " + smallest(x,y,z));

    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x,y),z);
    }
}
