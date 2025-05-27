package variables;

public class Bmi {

    //public class variables.Bmi {
    //  public static void main(String[] args) {
    //    double massInKg = 81.2;
    //    double heightInM = 1.78;
    //
    //    // Print the Body mass index (BMI) based on these values
    //  }
    //}

    public static void main(String[] args) {

        double massInKg = 81.2;
        double heightInM = 1.78;

        //The BMI is calculated by dividing an adult's weight in kilograms by
        // their height in metres squared. For example, if you weigh 70kg (around 11 stone)
        // and are 1.70m (around 5 foot 7 inches) tall, you work out your BMI by: squaring
        // your height in metres: 1.70 x 1.70 = 2.89.

        double heightSquared = heightInM * heightInM;
        double BMI = massInKg / heightSquared ;

        System.out.println("BMI : " + BMI);

        System.out.println(massInKg / (heightInM * heightInM));




    }
}

