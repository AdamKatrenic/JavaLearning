package scanner;

import java.util.Scanner;

public class AnimalsAndLegs {
    //public class scanner.AnimalsAndLegs {
    //  public static void main(String[] args) {
    //    // Write a program that asks for two integers
    //    // The first represents the number of chickens the farmer has
    //    // The second represents the number of pigs owned by the farmer
    //    // Print how many legs all the animals have in total
    //    //
    //    // Example
    //    //
    //    // Please enter the number of chickens: 4
    //    // Please enter the number of pigs: 2
    //    // The number of legs: 16
    //    //
    //  }
    //}
    public static void main(String[] args) {
        Scanner NumberOfChicken = new Scanner(System.in);
        System.out.println("Number Of Chickens :");
        int PocetSliepok = NumberOfChicken.nextInt();
        int PocetSlepacichNoh = PocetSliepok*2;

        Scanner NumberOfPigs = new Scanner(System.in);
        System.out.println("Number Of Pigs :");
        int PocetPrasat = NumberOfPigs.nextInt();
        int PocetPrasacichNoh = PocetPrasat*4;

        int NumberOfLegsTotal = PocetPrasacichNoh + PocetSlepacichNoh;
        System.out.println("The number of legs :" + NumberOfLegsTotal);






    }
}
