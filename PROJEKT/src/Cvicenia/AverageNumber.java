package Cvicenia;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        //Write a Java method to compute the average of three numbers.
        //Test Data:
        //Input the first number: 25
        //Input the second number: 45
        //Input the third number: 65
        //Expected Output:
        //
        //The average value is 45.0

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number: ");
        double z = in.nextDouble();

        System.out.println("The average of numbers is: " + average(x,y,z));
    }
    public static double average(double x, double y, double z){
        return (x + y + z) /3;
    }
}
