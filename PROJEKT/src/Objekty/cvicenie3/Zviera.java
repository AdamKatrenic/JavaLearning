package Objekty.cvicenie3;

public class Zviera {

    public Zviera(String meno) {
        this.hunger = 50;
        this.thirst = 50;
        this.meno = meno;
    }

    int hunger ;
    int thirst ;

    String meno;


    public void eat(){
    if (hunger>0){
        hunger --;
    }
    }

    public void drink(){
        if (thirst>0){
            thirst--;
            System.out.println(thirst);
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void play(){
        hunger++;
        thirst++;
        System.out.println(hunger+meno);
        System.out.println(thirst+meno);
        }
    }

