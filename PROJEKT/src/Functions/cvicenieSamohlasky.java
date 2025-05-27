package Functions;

import java.util.Scanner;

public class cvicenieSamohlasky {
    public static void main(String[] args) {
        Scanner veta = new Scanner(System.in);
        System.out.println("Zadajte vetu :");
        String text = veta.nextLine().toLowerCase();

        char[] samohlaskyArray = {'a' , 'e' , 'i' , 'o' , 'u'};
        String samohlasky ="";
        String spoluhlasky ="";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)){
                if ("aeiou".indexOf(ch)!=-1){
                    samohlasky += ch;
                }
                else {
                    spoluhlasky += ch;
                }
            }
        }


            System.out.println("V tejto vete je tolko samohlasok :" );
        }





    }

