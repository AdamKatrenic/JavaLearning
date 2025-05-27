public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Adam");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore<=90)) {
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.printf("This is an error");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}
