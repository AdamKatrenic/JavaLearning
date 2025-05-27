package Objekty.cvicenie4;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class SharpieMain {
    public static void main(String[] args) {
        //Create a SharpieMain class
        //We should know the followings about each sharpie:
        //color (which should be a string),
        //width (which will be a number) and the
        //inkAmount (another number)
        //We need to specify the color and the width at creation
        //Every sharpie is created with a default inkAmount value: 100
        //We can use() the sharpie objects: using it decreasesinkAmount by 10
/*
        Ceruzka Mceruzka = new Ceruzka("Modra",3);
        Ceruzka Oceruzka = new Ceruzka("Oranzova",2);
        Ceruzka Bceruzka = new Ceruzka("Biela", 1);

        Mceruzka.use();
        Mceruzka.use();

        Oceruzka.use();

        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();

        System.out.println(Bceruzka.getInkPercento());

        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();

        System.out.println(Bceruzka.getInkPercento());
*/
        SharpieSet peracnik1 = new SharpieSet();

        Ceruzka CiernaCeruzka = new Ceruzka("Cierna", 5);
        Ceruzka ZelenaCeruzka = new Ceruzka("Zelena", 4);
        Ceruzka ModraCeruzka = new Ceruzka("Modra", 4);
        Ceruzka CervenaCeruzka = new Ceruzka("Cervena", 4);
        Ceruzka FarebnaCeruzka = new Ceruzka("Farebna", 4);


        peracnik1.add(CiernaCeruzka);
        peracnik1.add(ZelenaCeruzka);
        peracnik1.add(ModraCeruzka);
        peracnik1.add(CervenaCeruzka);
        peracnik1.add(FarebnaCeruzka);

        System.out.println(peracnik1.countUsable());

        for (int i = 0; i < 10; i++) {
            CiernaCeruzka.use();
            ModraCeruzka.use();
            FarebnaCeruzka.use();
        }

        System.out.println(peracnik1.countUsable());

        peracnik1.removeTrash();
        System.out.println(peracnik1);


    }
}
