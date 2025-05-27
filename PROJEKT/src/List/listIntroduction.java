package List;

import java.util.ArrayList;
import java.util.List;

public class listIntroduction {
    public static void main(String[] args) {
        List<String> Names = new ArrayList<>();
        //Print out the number of elements in the list
        Names.add("William");
        System.out.println(Names.size());
        System.out.println(" ");
        //Print out whether the list is empty or not
        System.out.println(Names.isEmpty());
        System.out.println(" ");
        //Add "John" to the list + Add "Amanda" to the list
        //Print out the number of elements in the list
        Names.add("Amanda");
        Names.add("John");
        System.out.println(Names.size());
        System.out.println(" ");
        //print out the 3rd element
        System.out.println(Names.get(2));
        System.out.println(" ");

        //Iterate through the list in a reversed order and print out each name
        for (String meno:Names){
            System.out.println(meno);
        }
        System.out.println(" ");
        //Remove the 2nd element
        Names.remove(1);
        System.out.println(Names.size());
        System.out.println(" ");
        //Remove all elements
        Names.clear();
        System.out.println(Names.size());
        Names.add("William");
        Names.add("Amanda");
        Names.add("John");
        for (int i = 0; i < Names.size(); i++) {
            System.out.println((i + 1)+ ". " + Names.get(i));
            
        }

    }
}
