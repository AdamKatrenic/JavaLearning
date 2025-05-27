package Booleany;

import java.util.Scanner;
public class Conditionals {
        public static void main(String[] args) {
            Scanner kalkulacka = new Scanner(System.in);
            System.out.print("Height In Meters : ");
            double VyskaVM = kalkulacka.nextDouble();

            System.out.print("Mass In KG : ");
            double MassInKG = kalkulacka.nextDouble();

            double BMI = (MassInKG / (VyskaVM * VyskaVM));

            System.out.printf("BMI :%.2f%n", BMI);







            if (BMI<18) {
                System.out.println("chudy");
            } else if (BMI>25) {
                System.out.println("normalny");

            } else if (BMI>30) {
                System.out.println("tlutsy");

            }else {
                System.out.println("tucibomba");
            }
            kalkulacka.close();


        }
    }


