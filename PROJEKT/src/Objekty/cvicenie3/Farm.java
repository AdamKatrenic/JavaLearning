package Objekty.cvicenie3;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    //Reuse your AnimalMain class
    //Create a Farm class
    //it has a list of Animals listOfAnimals
    //it has a limit that defines how many animals can be kept in the Farm
    //and can be set when the Farm is created
    //it has two methods:
    //breed() -> creates a new animal if there's place for it
    //sell() -> removes the least hungry animal

    List<Zviera> listOfAnimals = new ArrayList<>();
    int capacity;

    public Farm(int capacity) {
        this.capacity = capacity;
    }

    public void breed(Zviera zviera1) {
        if (listOfAnimals.size() < capacity) {
            listOfAnimals.add(zviera1);
            System.out.println("Zviera pridane " + zviera1.meno);
        } else {
            System.out.println("Kapacita je plna pre " + zviera1.meno);
        }
    }

    public void display() {
        if (!listOfAnimals.isEmpty()) {
            for (Zviera forzviera : listOfAnimals) {
                System.out.println("Name : " + forzviera.meno +
                        " Hunger : " + forzviera.hunger +
                        " Thirst : " + forzviera.thirst);
            }
        } else {
            System.out.println("No animals");
        }
    }

    public void sell() {
        if (listOfAnimals.isEmpty()) {
            System.out.println("No animals to sell");
            return;
        }
        Zviera leastHungry = listOfAnimals.get(0);
        boolean allSameHunger = true;

        for (Zviera predavanie : listOfAnimals) {
            if (predavanie.getHunger() != leastHungry.getHunger()) {
                allSameHunger = false;
                break;
            }

        }
        if (allSameHunger){
            System.out.println("Nemozno predat");
            return;
        }

        for (Zviera predavanie : listOfAnimals) {
            if (predavanie.getHunger() < leastHungry.getHunger()) {
                leastHungry = predavanie;
            }
        }
        listOfAnimals.remove(leastHungry);
        System.out.println("Predane " + leastHungry.meno);
    }
}


























