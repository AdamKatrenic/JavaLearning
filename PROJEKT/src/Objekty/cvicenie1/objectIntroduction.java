package Objekty.cvicenie1;

public class objectIntroduction {
    public static void main(String[] args) {
        //Create a PostIt class that has
        //a backgroundColor represented by a string
        //a text on it
        //a textColor represented by a string
        //Create a few example post-it objects:
        //an orange with blue text: "Idea 1"
        //a pink with black text: "Awesome"
        //a yellow with green text: "Superb!"
        PostIt ideas1 = new PostIt("Idea 1" , "blue" , "orange");

        PostIt ideas2 = new PostIt("Awesome" , "black" , "pink");

        PostIt ideas3 = new PostIt("Superb!" , "green" , "yellow");

        System.out.println(ideas1);
        System.out.println(ideas2);
        System.out.println(ideas3);
    }
}
