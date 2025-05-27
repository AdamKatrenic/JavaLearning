package Objekty.cvicenie4;

public class Ceruzka {

    public Ceruzka(String color, int width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    public int getInkAmount() {
        return inkAmount;
    }
    public String getInkPercento(){
        return color + " " + inkAmount + " %";
    }


        String color;
    int width;
    public int inkAmount;

    public void use(){
        if (inkAmount>0){
            inkAmount = inkAmount - 10;
            //System.out.println(color + " " + inkAmount + "%");

            //if (inkAmount==0){
              //  doplnitPero();
              //  getInkPercento();
            //}
        }

    }
    public void doplnitPero(){
        if (inkAmount==0){
            inkAmount = inkAmount + 100;
            System.out.println("Pero bolo doplnene");

        }
    }

}
