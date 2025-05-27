package scanner;

import java.util.Scanner;

public class bmikalkulacka {
    public static void main(String[] args) {
        Scanner kalkulacka = new Scanner(System.in);
        System.out.print("Height In Meters : ");
        double VyskaVM = kalkulacka.nextDouble();

        System.out.print("Mass In KG : ");
        double MassInKG = kalkulacka.nextDouble();

        double BMI = (MassInKG / (VyskaVM * VyskaVM));

        System.out.printf("BMI :%.2f%n", BMI);

    }
}
