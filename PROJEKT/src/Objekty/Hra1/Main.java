package Objekty.Hra1;

import Objekty.Hra1.Postavy.Gremlin;
import Objekty.Hra1.Postavy.NPC;
import Objekty.Hra1.Zbrane.Luk1;
import Objekty.Hra1.Zbrane.Mec1;

public class Main {
    public static void main(String[] args) {

        NPC Adam = new NPC(100, 50, 35, 10,1000);
        NPC Garen = new NPC(120, 100, 70, 12, 3000);

        Gremlin Corki = new Gremlin(70, 30, 50, 9 ,1700);
        Gremlin Teemo = new Gremlin(40, 40, 65, 11, 2500);

        Mec1 Katana = new Mec1(100, 1 , 5);

        Luk1 Longbow = new Luk1(120, 100, 1);

        Adam.addWeapon(Katana);
        Garen.addWeapon(Longbow);

    }
}
