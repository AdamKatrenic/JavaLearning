package Objekty.cvicenie3;

public class AnimalMain {
    public static void main(String[] args) {


        Farm Osikov = new Farm(10);

        Zviera krava = new Zviera("Krava");
        Zviera velkaKrava = new Zviera("Velka Krava");
        Zviera velkePrasa = new Zviera("Velke Prasa");
        Zviera prasa = new Zviera("Prasa");
        Zviera kura = new Zviera("Kura");
        Zviera kohut = new Zviera("Kohut");
        Zviera hus = new Zviera("Hus");
        Zviera pes = new Zviera("Pes");
        Zviera macka = new Zviera("Macka");
        Zviera potkan = new Zviera("Potkan");
        Zviera holub = new Zviera("Holub");


        Osikov.breed(krava);
        Osikov.breed(velkaKrava);
        Osikov.breed(velkePrasa);
        Osikov.breed(prasa);
        Osikov.breed(kura);
        Osikov.breed(kohut);
        Osikov.breed(hus);
        Osikov.breed(pes);
        Osikov.breed(macka);
        Osikov.breed(potkan);
        Osikov.breed(holub);

        System.out.println(" ");

        Osikov.display();

        System.out.println(" ");

        prasa.eat();
        macka.eat();
        macka.eat();

        System.out.println(" ");

        Osikov.display();

        Osikov.sell();

        System.out.println(" ");

        Osikov.display();

        Osikov.sell();

        System.out.println(" ");

        Osikov.display();

        Osikov.sell();

        Osikov.sell();


    }
    //Create an AnimalMain class
    //Every animal has a hunger value, which is a whole number
    //Every animal has a thirst value, which is a whole number
    //When creating a new animal instance these values must be set to the
    //default 50 value
    //Every animal can eat() which decreases its hunger by one
    //Every animal can drink() which decreases its thirst by one
    //Every animal can play() which increases both its hunger and thirst by one



}
