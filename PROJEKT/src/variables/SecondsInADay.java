package variables;

public class SecondsInADay {
    //public class variables.SecondsInADay {
    //  public static void main(String[] args) {
    //    int currentHours = 14;
    //    int currentMinutes = 34;
    //    int currentSeconds = 42;
    //
    //    // Write a program that prints the remaining seconds (as an integer) from a
    //    // day if the current time is represented by the variables above
    //  }
    //}

    public static void main(String[] args) {
         int currentHours = 14;
         int currentMinutes = 34;
         int currentSeconds = 42;

         int DayInSeconds = 24*60*60;


         //int variables.SecondsInADay = 24 * 60 * 60;
         //int SecondsInAMinute = 60 * 60;
        // int SecondsInASecond= 60;


        System.out.println("Seconds Remaining: " + (DayInSeconds - (currentHours*60*60)-(currentMinutes*60)-(currentSeconds)));



    }
}
