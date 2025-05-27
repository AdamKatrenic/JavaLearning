package StringBuilder;

import java.util.Scanner;

public class Diktat {
    //oprav chyby :D
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj diktat: ");
        String zaklad = scn.nextLine();

        System.out.println("Pis diktat: ");
        String diktat = scn.nextLine();

        System.out.println(zaklad.compareTo(diktat));
    }

    public static  void oprava (StringBuilder sb){

        String[] words = sb.toString().split(" ");
        StringBuilder vysledok = new StringBuilder();

        for (String word : words){
            if ()
        }

    }
}
