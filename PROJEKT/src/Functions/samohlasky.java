package Functions;

import java.util.Scanner;

public class samohlasky {
        public static void main(String[] args) {
            Scanner veta = new Scanner(System.in);
            System.out.println("Zadajte vetu :");
            String text = veta.nextLine().toLowerCase();

            int samohlaskyCislo =0;
            int spoluhlaskyCislo =0;

            String samohlaskyText ="";
            String spoluhlaskyText ="";

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);


                if (Character.isLetter(ch)) {
                    if ("aeiou".indexOf(ch) != -1) {
                        samohlaskyCislo++;
                        samohlaskyText+=ch+"";
                    } else {
                        spoluhlaskyCislo++;
                        spoluhlaskyText+=ch+"";

                    }

                }

            }


            System.out.println("V tejto vete je tolko samohlasok : " + samohlaskyCislo);
            System.out.println("V tejto vete je tolko spoluhlasok : " + spoluhlaskyCislo);
            System.out.println("V tejto vete je tolko cisel : " + spoluhlaskyText + samohlaskyText);

        }





    }


