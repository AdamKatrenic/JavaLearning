package Objekty.cvicenie4;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    //Reuse your SharpieMain class
    //Create SharpieSet class
    //it contains a list of Sharpies, named listOfSharpies
    //it has a method that adds a new SharpieMain to the set:add(sharpie)
    //it has a method that returns the number of usable Sharpies:countUsable() -> sharpie is usable if it contains ink
    //it has a method that removes all unusable Sharpies:removeTrash()
    //Test your class by adding usable and unusable sharpies, then
    //call the removeTrash() function
    //Test your class also by having 3 unusable sharpies only, then
    //call the removeTrash() function

    List<Ceruzka> ListOfSharpies = new ArrayList<>();

    public void add(Ceruzka ceruzka) {
        ListOfSharpies.add(ceruzka);
    }

    public int countUsable() {
        int pocitadlo = 0;
        for (Ceruzka ceruzka : ListOfSharpies) {
            if (ceruzka.inkAmount > 0) {
                pocitadlo++;
            }
        }
        return pocitadlo;
    }

    public void removeTrash() {
        ListOfSharpies.removeIf(ceruzka -> ceruzka.inkAmount<=0);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ceruzka ceruzka : ListOfSharpies) {
            sb.append(ceruzka.getInkPercento()).append("\n");
        }
        return sb.toString();
    }
}
