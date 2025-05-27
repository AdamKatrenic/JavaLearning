package Booleany;

public class Booleans {

    public static void main(String[] args) {
        //basic true false
        boolean true1 = true;
        boolean true2 = false;

        System.out.println(true1);
        System.out.println(true2);


        //negation bool

        boolean pravda = true;
        boolean nepravda = false;

        System.out.println("NOT ! below");
        System.out.println(!pravda);
        System.out.println(!nepravda);

        // and && 2 both must be true otherwise false
        System.out.println("AND && below");
        System.out.println(pravda&&pravda); //t
        System.out.println(pravda&&nepravda); //f
        System.out.println(nepravda&&pravda); //f
        System.out.println(nepravda&&pravda); //f

        // OR   one must be true for result to be true
        System.out.println("OR || below");
        System.out.println(pravda||pravda); //t
        System.out.println(pravda||pravda); //t
        System.out.println(nepravda||pravda); //t
        System.out.println(nepravda||nepravda); //f
    }


}