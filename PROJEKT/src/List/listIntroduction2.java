package List;

import java.util.ArrayList;
import java.util.List;

public class listIntroduction2 {
    //Create a list ('List A') which contains the following values
    //Apple, Avocado, Blueberries, Durian, Lychee
    //Create a new list ('List B') with the values of List A
    //Print out whether List A contains "Durian" or not
    //Remove "Durian" from List B
    //Add "Kiwifruit" to List A after the 4th element
    //Compare the size of List A and List B
    //Get the index of "Avocado" from List A
    //Get the index of "Durian" from List B
    //Add "Passion Fruit" and "Pomelo" to List B in a single statement
    //Print out the 3rd element from List A
    //Print all elements of List A
    //Print all elements of List B
    //
    //The full output of your main method should be...

    public static void main(String[] args) {
        List<String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        System.out.println(" ");

        List<String> ListB = new ArrayList<>(ListA);

        System.out.println(ListA.contains("Durian"));
        System.out.println(" ");

        ListB.remove("Durian");
        ListA.add(4, "KiwiFruit");

        System.out.println(ListA.size() == ListB.size());
        System.out.println(" ");

        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(" ");

        System.out.println(ListB.indexOf("Durian"));
        System.out.println(" ");

        ListB.addAll(List.of("Passion Fruit" , "Pomelo"));
        System.out.println(" ");

        System.out.println(ListA.get(2));
        System.out.println(" ");

        System.out.println(ListA);
        System.out.println(ListB);








    }


}
