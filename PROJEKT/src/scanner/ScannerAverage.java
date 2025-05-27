package scanner;

import java.util.Scanner;

public class ScannerAverage {
    public static void main(String[] args) {
        Scanner priemercisel = new Scanner(System.in);
        System.out.println("Zadaj Cisla :");
        System.out.print("Zadaj Cislo 1:");
        double cislo1 = priemercisel.nextDouble();
        System.out.print("zadaj Cislo 2:");
        double cislo2 = priemercisel.nextDouble();
        System.out.print("Zadaj Cislo 3:");
        double cislo3 = priemercisel.nextDouble();
        System.out.print("Zadaj Cislo 4:");
        double cislo4 = priemercisel.nextDouble();
        System.out.print("Zadaj Cislo 5:");
        double cislo5 = priemercisel.nextDouble();

        double priemer = ((cislo1 + cislo2 + cislo3 + cislo4 + cislo5) / 5);
        double sucet = cislo1 + cislo2 + cislo3 + cislo4 + cislo5;
        System.out.println("Sucet Cisel:" + sucet);
        System.out.println("Priemer Cisel :" + priemer );





    }
}
