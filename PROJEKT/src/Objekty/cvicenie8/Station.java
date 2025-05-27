package Objekty.cvicenie8;

public class Station {
    int gasAmountInStation;
    //1000L
    public void refill(Car auto) {
        int naftaPotrebna = auto.capacity - auto.gasAmountInCar; //100-50=50
        if (naftaPotrebna<=gasAmountInStation) { // ked je 50 vacsie cislo ako je v kapacite benzinky
            gasAmountInStation -= naftaPotrebna; //odpocitanie 50 od kapacity benzinky
            auto.fill(naftaPotrebna); //dolievanie nafty do auta
            System.out.println(auto.getName() + " Natankovane"); // sprava

        } else {
            System.out.println(auto.getName() + " sa neda natankovat");
        }
        //else (gasAmountInStation>naftaPotrebna) {
            //System.out.println("neda sa natankovat");


    }
    public Station(int gasAmount) {
        this.gasAmountInStation = gasAmount;
    }
    public int getGasAmountInStation() {
        return gasAmountInStation;
    }

}
//int naftaPotrebna = gasAmountInStation - auto.getGasAmountInCar();
//        if (naftaPotrebna <= gasAmountInStation) { //toto kontroluje ci ma benzinka dost paliva
//            gasAmountInStation -= naftaPotrebna;
//            auto.fill(naftaPotrebna);
//            System.out.println(auto.getName()+ " Natankovalo " + "Zostatok v benzinke : " + naftaPotrebna);
//        } else if (gasAmountInStation > 0) {
//            auto.fill(gasAmountInStation);
//            System.out.println(auto.getName() + " Natankovalo čiastočne....... Zostatok v benzinke: 0");
//            gasAmountInStation = 0;
//        }