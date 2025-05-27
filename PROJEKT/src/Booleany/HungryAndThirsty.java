package Booleany;

public class HungryAndThirsty {
    //Create a program that decides whether it's "Lunch time," "Snack time," or "No food" based on the user’s thirst and hunger levels.
    //
    //Instructions:
    //Declare two boolean variables:
    //
    //thirsty: Represents whether the person is thirsty (true or false).
    //hungry: Represents whether the person is hungry (true or false).
    //Use an if-else statement to determine the output:
    //
    //If the person is both thirsty and hungry, print "Lunch time!".
    //If the person is either thirsty or hungry (but not both), print "Snack time!".
    //If the person is neither thirsty nor hungry, print "No food for you.".
    public static void main(String[] args) {
        boolean thirsty = true;
        boolean hungry = true;

        if (thirsty&&hungry) {
            System.out.println("Lunch Time");
        } else if (thirsty||hungry) {
            System.out.println("Snack Time");
            
        }else {
            System.out.println("No food for you");
        }

        System.out.println(!thirsty);


    }


}
