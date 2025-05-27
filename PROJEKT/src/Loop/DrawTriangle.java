package Loop;

import java.util.Scanner;

public class DrawTriangle {
    //public class Loop.DrawTriangle {
    //  public static void main(String[] args) {
    //    // Write a program that reads a number from the standard input and
    //    // then draws a triangle of the specified height
    //    //
    //    // Example:
    //    //
    //    // Please enter the triangle height: 4
    //    // *
    //    // **
    //    // ***
    //    // ****
    //  }
    //
    //  public static void draw(int height){
    //    // Write your code to draw the triangle here
    //  }
    //}

    public static void main(String[] args) {
        Scanner trojuholnik = new Scanner(System.in);
        System.out.println("Zadaj vysku :");
        double triangleheight =trojuholnik.nextDouble();

        for (int i = 1 ; i <= triangleheight; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }






    }

}
